import { MethodContext } from "../../../antlr/yaplParser";
import { IMemoryVisitor, MemoryVisitor } from "../Memory";
import { Move } from "./Instructions/MemoryManagement";
import { MethodDeclaration } from "./Instructions/Misc";
import { TemporalValue, V0 } from "./TemporaryValues";

export default function (visitor: MemoryVisitor, ctx: MethodContext): IMemoryVisitor[] {
    const name = ctx.IDENTIFIER();
    const currentClassName = visitor.currentClass().getName();
    const expectedName = `${currentClassName}::${name.text}()`;
    visitor.pushScope(expectedName);
    visitor.addQuadruple(new MethodDeclaration(expectedName));
    const children = visitor.visitChildren(ctx);
    const lastChild = children.at(-1)!;
    visitor.writeReturn(lastChild.getTemporal());
    visitor.popScope();

    const temporal = new TemporalValue();
    visitor.addQuadruple(new Move({ dataMovesInto: temporal, dataMovesFrom: new V0() }));

    const size = 0;
    const getTemporal = () => temporal;

    return [{ size, getTemporal }];
}
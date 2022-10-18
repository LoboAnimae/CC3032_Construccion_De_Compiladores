import { LessEqualContext } from 'antlr/yaplParser';
import BoolType from 'Implementations/Generics';
import { IMemoryVisitor, MemoryVisitor } from 'Implementations/4_Intermediate/visitor';
import { LESSEQUAL } from '../Instructions/Comparison';
import { TemporalValue } from '../../../Components/TemporaryValues';

export default function (visitor: MemoryVisitor, ctx: LessEqualContext): IMemoryVisitor[] {
  const [leftExpression, rightExpression] = ctx.expression();
  const [left] = visitor.visit(leftExpression);
  const [right] = visitor.visit(rightExpression);
  const temporal = new TemporalValue();

  visitor.addQuadruple(
    new LESSEQUAL({
      fistOperand: left.getTemporal(),
      secondOperand: right.getTemporal(),
      goTo: temporal.toString(),
    }),
  );

  return [{ size: BoolType.Size, getTemporal: () => temporal }];
}
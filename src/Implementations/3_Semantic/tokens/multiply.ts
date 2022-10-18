import { MultiplyContext } from 'antlr/yaplParser';
import { EmptyComponent, extractQuadruplet, extractTypeComponent } from 'Components';
import { YaplVisitor } from 'Implementations/3_Semantic/visitor';
import { IntType } from 'Implementations/Generics';

export function visitMultiply(visitor: YaplVisitor, ctx: MultiplyContext) {
  const [leftChild, rightChild] = ctx.expression();
  const intTable = visitor.findTable(IntType.Name)!.copy();

  const leftElement = visitor.visit(leftChild);
  const rightElement = visitor.visit(rightChild);

  const lExpr = extractTypeComponent(leftElement);
  const rExpr = extractTypeComponent(rightElement);

  let entered = false;
  if (!lExpr) {
    visitor.addError(ctx, `Expression ${leftChild.text} cannot be operated with arithmetic`);
    entered = true;
  }
  if (!rExpr) {
    visitor.addError(ctx, `Expression ${rightChild.text} cannot be operated with arithmetic`);
    entered = true;
  }
  if (entered) {
    return new EmptyComponent();
  }

  const allowedComparison = lExpr!.allowsComparisonTo(rExpr!);

  // ERROR: If one of them is an ancestor of the other, they can be compared
  if (!allowedComparison) {
    const leftName = leftChild.text ?? leftChild.toString();
    const rightName = rightChild.text ?? rightChild.toString();
    visitor.addError(ctx, `Invalid Operation between ${leftName} and ${rightName}`);
    return new EmptyComponent();
  }
  return intTable;
}

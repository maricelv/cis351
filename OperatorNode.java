
/**
 * Operator nodes are the internal nodes of a binary expression tree.
 * 
 * @author Maricel Vicente
 * @version April 27, 2020
 */
public class OperatorNode extends ExpressionNode {

  private Operator op;

  public OperatorNode(Operator op) {
    super();
    this.op = op;
  }

  public OperatorNode(Operator op, ExpressionNode left, ExpressionNode right) {
    super(left, right);
    this.op = op;
  }

  /**
   * Evaluate the expression rooted at this node and return the result.
   */
  @Override
  public double evaluate() {

    // UNFINISHED.
    double num = 0;
    if(op.opString() == "+"){
      num = right().evaluate() + left().evaluate();
    }
    else if(op.opString() == "-"){
      num = left().evaluate() - right().evaluate();
    }
    else if(op.opString() == "*"){
      num = right().evaluate() * left().evaluate();
    }
    else if(op.opString() == "/"){
      num = left().evaluate() / right().evaluate();
    }
    return num;

  }

  @Override
  public String postfixString() {
    // UNFINISHED (See superclass javadocs for requirements.)
    String leftSubtree = left().postfixString();
    String rightSubtree = right().postfixString();
    return leftSubtree + rightSubtree + op.opString();
  }

  @Override
  public String prefixString() {
    // UNFINISHED
    String leftSubtree = left().prefixString();
    String rightSubtree = right().prefixString();
    return leftSubtree + rightSubtree + op.opString(); 
  }

  @Override
  public String infixString() {
    // UNFINISHED
    String leftSubtree = left().infixString();
    String rightSubtree = right().infixString();
    return leftSubtree + rightSubtree + op.opString(); 
  }


}
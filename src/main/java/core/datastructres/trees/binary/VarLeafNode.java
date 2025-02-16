package core.datastructres.trees.binary;

public class VarLeafNode implements VarBinNode {

  private String operate;

  private final String operand; // Operand value

  VarLeafNode(String val) {
    operand = val;
  }

  public boolean isLeaf() {
    return true;
  }

  public String value() {
    return operand;
  }

  public void traverse() {
    //        Visit.VisitLeafNode(operand);
  }
}

/* Generated By:JJTree: Do not edit this line. ASTLNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTLNode extends SimpleNode {
  public ASTLNode(int id) {
    super(id);
  }

  public ASTLNode(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4c8eee3888547d8f827c0fb6509a6897 (do not edit this line) */

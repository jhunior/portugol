/* Generated By:JJTree: Do not edit this line. ASTNotNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTNotNode extends SimpleNode {
  public ASTNotNode(int id) {
    super(id);
  }

  public ASTNotNode(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c85993a62cf80129131a198e7d2c45d8 (do not edit this line) */

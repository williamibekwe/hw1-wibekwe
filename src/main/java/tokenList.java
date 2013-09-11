

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** list of all the tokens in the answer or a question.
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class tokenList extends StringList {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(tokenList.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected tokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public tokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public tokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets token in a list of tokens
   * @generated */
  public token getToken() {
    if (tokenList_Type.featOkTst && ((tokenList_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "tokenList");
    return (token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((tokenList_Type)jcasType).casFeatCode_token)));}
    
  /** setter for token - sets token in a list of tokens 
   * @generated */
  public void setToken(token v) {
    if (tokenList_Type.featOkTst && ((tokenList_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "tokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((tokenList_Type)jcasType).casFeatCode_token, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: nGramList

  /** getter for nGramList - gets list of n gram combination by number of words.
   * @generated */
  public nGramList getNGramList() {
    if (tokenList_Type.featOkTst && ((tokenList_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "tokenList");
    return (nGramList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((tokenList_Type)jcasType).casFeatCode_nGramList)));}
    
  /** setter for nGramList - sets list of n gram combination by number of words. 
   * @generated */
  public void setNGramList(nGramList v) {
    if (tokenList_Type.featOkTst && ((tokenList_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "tokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((tokenList_Type)jcasType).casFeatCode_nGramList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
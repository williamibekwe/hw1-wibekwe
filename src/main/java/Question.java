

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** question of the model
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenList

  /** getter for tokenList - gets list of tokens from the question
   * @generated */
  public tokenList getTokenList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Question");
    return (tokenList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets list of tokens from the question 
   * @generated */
  public void setTokenList(tokenList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: NumOfTokens

  /** getter for NumOfTokens - gets Number of tokesn in token list
   * @generated */
  public int getNumOfTokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NumOfTokens == null)
      jcasType.jcas.throwFeatMissing("NumOfTokens", "Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_NumOfTokens);}
    
  /** setter for NumOfTokens - sets Number of tokesn in token list 
   * @generated */
  public void setNumOfTokens(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NumOfTokens == null)
      jcasType.jcas.throwFeatMissing("NumOfTokens", "Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_NumOfTokens, v);}    
   
    
  //*--------------*
  //* Feature: QuestionString

  /** getter for QuestionString - gets the entire question string
   * @generated */
  public String getQuestionString() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionString == null)
      jcasType.jcas.throwFeatMissing("QuestionString", "Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionString);}
    
  /** setter for QuestionString - sets the entire question string 
   * @generated */
  public void setQuestionString(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionString == null)
      jcasType.jcas.throwFeatMissing("QuestionString", "Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionString, v);}    
  }

    
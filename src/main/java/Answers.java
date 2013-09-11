

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** a certain answer
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class Answers extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answers.class);
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
  protected Answers() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answers(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answers(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answers(JCas jcas, int begin, int end) {
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
  //* Feature: answerTokens

  /** getter for answerTokens - gets list of tokens in an answer
   * @generated */
  public tokenList getAnswerTokens() {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "Answers");
    return (tokenList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_answerTokens)));}
    
  /** setter for answerTokens - sets list of tokens in an answer 
   * @generated */
  public void setAnswerTokens(tokenList v) {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "Answers");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answers_Type)jcasType).casFeatCode_answerTokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: weight

  /** getter for weight - gets weight of a the answer
   * @generated */
  public double getWeight() {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "Answers");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answers_Type)jcasType).casFeatCode_weight);}
    
  /** setter for weight - sets weight of a the answer 
   * @generated */
  public void setWeight(double v) {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "Answers");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answers_Type)jcasType).casFeatCode_weight, v);}    
   
    
  //*--------------*
  //* Feature: AnswerString

  /** getter for AnswerString - gets the entire answer string
   * @generated */
  public String getAnswerString() {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_AnswerString == null)
      jcasType.jcas.throwFeatMissing("AnswerString", "Answers");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answers_Type)jcasType).casFeatCode_AnswerString);}
    
  /** setter for AnswerString - sets the entire answer string 
   * @generated */
  public void setAnswerString(String v) {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_AnswerString == null)
      jcasType.jcas.throwFeatMissing("AnswerString", "Answers");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answers_Type)jcasType).casFeatCode_AnswerString, v);}    
  }

    
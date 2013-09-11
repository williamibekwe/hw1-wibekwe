

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** list of answers
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class AnswerList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerList.class);
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
  protected AnswerList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerList(JCas jcas, int begin, int end) {
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
  //* Feature: Answers

  /** getter for Answers - gets an answers within a list of answers
   * @generated */
  public Answers getAnswers() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "AnswerList");
    return (Answers)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_Answers)));}
    
  /** setter for Answers - sets an answers within a list of answers 
   * @generated */
  public void setAnswers(Answers v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "AnswerList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_Answers, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: NumberOfAnswers

  /** getter for NumberOfAnswers - gets count of the number of answers
   * @generated */
  public int getNumberOfAnswers() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_NumberOfAnswers == null)
      jcasType.jcas.throwFeatMissing("NumberOfAnswers", "AnswerList");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_NumberOfAnswers);}
    
  /** setter for NumberOfAnswers - sets count of the number of answers 
   * @generated */
  public void setNumberOfAnswers(int v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_NumberOfAnswers == null)
      jcasType.jcas.throwFeatMissing("NumberOfAnswers", "AnswerList");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_NumberOfAnswers, v);}    
  }

    
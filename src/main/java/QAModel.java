

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** The question and answer language model
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class QAModel extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAModel.class);
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
  protected QAModel() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAModel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAModel(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public Question getQuestion() {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "QAModel");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "QAModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public AnswerList getAnswerList() {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "QAModel");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(AnswerList v) {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "QAModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: EvaluationList

  /** getter for EvaluationList - gets List of Answers with ranked from highest weight to lowest weight.
   * @generated */
  public AnswerList getEvaluationList() {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_EvaluationList == null)
      jcasType.jcas.throwFeatMissing("EvaluationList", "QAModel");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_EvaluationList)));}
    
  /** setter for EvaluationList - sets List of Answers with ranked from highest weight to lowest weight. 
   * @generated */
  public void setEvaluationList(AnswerList v) {
    if (QAModel_Type.featOkTst && ((QAModel_Type)jcasType).casFeat_EvaluationList == null)
      jcasType.jcas.throwFeatMissing("EvaluationList", "QAModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAModel_Type)jcasType).casFeatCode_EvaluationList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
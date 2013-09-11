
/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** The question and answer language model
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class QAModel_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAModel_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAModel_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAModel(addr, QAModel_Type.this);
  			   QAModel_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAModel(addr, QAModel_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAModel.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QAModel");
 
  /** @generated */
  final Feature casFeat_Question;
  /** @generated */
  final int     casFeatCode_Question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "QAModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "QAModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_Question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerList;
  /** @generated */
  final int     casFeatCode_AnswerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "QAModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "QAModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_EvaluationList;
  /** @generated */
  final int     casFeatCode_EvaluationList;
  /** @generated */ 
  public int getEvaluationList(int addr) {
        if (featOkTst && casFeat_EvaluationList == null)
      jcas.throwFeatMissing("EvaluationList", "QAModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_EvaluationList);
  }
  /** @generated */    
  public void setEvaluationList(int addr, int v) {
        if (featOkTst && casFeat_EvaluationList == null)
      jcas.throwFeatMissing("EvaluationList", "QAModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_EvaluationList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAModel_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Question = jcas.getRequiredFeatureDE(casType, "Question", "Question", featOkTst);
    casFeatCode_Question  = (null == casFeat_Question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Question).getCode();

 
    casFeat_AnswerList = jcas.getRequiredFeatureDE(casType, "AnswerList", "AnswerList", featOkTst);
    casFeatCode_AnswerList  = (null == casFeat_AnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerList).getCode();

 
    casFeat_EvaluationList = jcas.getRequiredFeatureDE(casType, "EvaluationList", "AnswerList", featOkTst);
    casFeatCode_EvaluationList  = (null == casFeat_EvaluationList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EvaluationList).getCode();

  }
}



    

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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** list of answers
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class AnswerList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerList(addr, AnswerList_Type.this);
  			   AnswerList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerList(addr, AnswerList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerList");
 
  /** @generated */
  final Feature casFeat_Answers;
  /** @generated */
  final int     casFeatCode_Answers;
  /** @generated */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "AnswerList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Answers);
  }
  /** @generated */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "AnswerList");
    ll_cas.ll_setRefValue(addr, casFeatCode_Answers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NumberOfAnswers;
  /** @generated */
  final int     casFeatCode_NumberOfAnswers;
  /** @generated */ 
  public int getNumberOfAnswers(int addr) {
        if (featOkTst && casFeat_NumberOfAnswers == null)
      jcas.throwFeatMissing("NumberOfAnswers", "AnswerList");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NumberOfAnswers);
  }
  /** @generated */    
  public void setNumberOfAnswers(int addr, int v) {
        if (featOkTst && casFeat_NumberOfAnswers == null)
      jcas.throwFeatMissing("NumberOfAnswers", "AnswerList");
    ll_cas.ll_setIntValue(addr, casFeatCode_NumberOfAnswers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Answers = jcas.getRequiredFeatureDE(casType, "Answers", "Answers", featOkTst);
    casFeatCode_Answers  = (null == casFeat_Answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Answers).getCode();

 
    casFeat_NumberOfAnswers = jcas.getRequiredFeatureDE(casType, "NumberOfAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_NumberOfAnswers  = (null == casFeat_NumberOfAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NumberOfAnswers).getCode();

  }
}



    
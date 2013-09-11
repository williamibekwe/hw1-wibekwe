
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

/** a certain answer
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class Answers_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answers_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answers_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answers(addr, Answers_Type.this);
  			   Answers_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answers(addr, Answers_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answers.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answers");
 
  /** @generated */
  final Feature casFeat_answerTokens;
  /** @generated */
  final int     casFeatCode_answerTokens;
  /** @generated */ 
  public int getAnswerTokens(int addr) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "Answers");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens);
  }
  /** @generated */    
  public void setAnswerTokens(int addr, int v) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "Answers");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerTokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_weight;
  /** @generated */
  final int     casFeatCode_weight;
  /** @generated */ 
  public double getWeight(int addr) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "Answers");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_weight);
  }
  /** @generated */    
  public void setWeight(int addr, double v) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "Answers");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_weight, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerString;
  /** @generated */
  final int     casFeatCode_AnswerString;
  /** @generated */ 
  public String getAnswerString(int addr) {
        if (featOkTst && casFeat_AnswerString == null)
      jcas.throwFeatMissing("AnswerString", "Answers");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AnswerString);
  }
  /** @generated */    
  public void setAnswerString(int addr, String v) {
        if (featOkTst && casFeat_AnswerString == null)
      jcas.throwFeatMissing("AnswerString", "Answers");
    ll_cas.ll_setStringValue(addr, casFeatCode_AnswerString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answers_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerTokens = jcas.getRequiredFeatureDE(casType, "answerTokens", "tokenList", featOkTst);
    casFeatCode_answerTokens  = (null == casFeat_answerTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerTokens).getCode();

 
    casFeat_weight = jcas.getRequiredFeatureDE(casType, "weight", "uima.cas.Double", featOkTst);
    casFeatCode_weight  = (null == casFeat_weight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_weight).getCode();

 
    casFeat_AnswerString = jcas.getRequiredFeatureDE(casType, "AnswerString", "uima.cas.String", featOkTst);
    casFeatCode_AnswerString  = (null == casFeat_AnswerString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerString).getCode();

  }
}



    
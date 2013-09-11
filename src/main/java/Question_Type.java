
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

/** question of the model
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class Question_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Question");
 
  /** @generated */
  final Feature casFeat_tokenList;
  /** @generated */
  final int     casFeatCode_tokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NumOfTokens;
  /** @generated */
  final int     casFeatCode_NumOfTokens;
  /** @generated */ 
  public int getNumOfTokens(int addr) {
        if (featOkTst && casFeat_NumOfTokens == null)
      jcas.throwFeatMissing("NumOfTokens", "Question");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NumOfTokens);
  }
  /** @generated */    
  public void setNumOfTokens(int addr, int v) {
        if (featOkTst && casFeat_NumOfTokens == null)
      jcas.throwFeatMissing("NumOfTokens", "Question");
    ll_cas.ll_setIntValue(addr, casFeatCode_NumOfTokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_QuestionString;
  /** @generated */
  final int     casFeatCode_QuestionString;
  /** @generated */ 
  public String getQuestionString(int addr) {
        if (featOkTst && casFeat_QuestionString == null)
      jcas.throwFeatMissing("QuestionString", "Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_QuestionString);
  }
  /** @generated */    
  public void setQuestionString(int addr, String v) {
        if (featOkTst && casFeat_QuestionString == null)
      jcas.throwFeatMissing("QuestionString", "Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_QuestionString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenList = jcas.getRequiredFeatureDE(casType, "tokenList", "tokenList", featOkTst);
    casFeatCode_tokenList  = (null == casFeat_tokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenList).getCode();

 
    casFeat_NumOfTokens = jcas.getRequiredFeatureDE(casType, "NumOfTokens", "uima.cas.Integer", featOkTst);
    casFeatCode_NumOfTokens  = (null == casFeat_NumOfTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NumOfTokens).getCode();

 
    casFeat_QuestionString = jcas.getRequiredFeatureDE(casType, "QuestionString", "uima.cas.String", featOkTst);
    casFeatCode_QuestionString  = (null == casFeat_QuestionString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionString).getCode();

  }
}



    

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

/** a word that consists of a combination of ascii symbols.
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new token(addr, token_Type.this);
  			   token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new token(addr, token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("token");
 
  /** @generated */
  final Feature casFeat_startToken;
  /** @generated */
  final int     casFeatCode_startToken;
  /** @generated */ 
  public boolean getStartToken(int addr) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_startToken);
  }
  /** @generated */    
  public void setStartToken(int addr, boolean v) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_startToken, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endToken;
  /** @generated */
  final int     casFeatCode_endToken;
  /** @generated */ 
  public boolean getEndToken(int addr) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_endToken);
  }
  /** @generated */    
  public void setEndToken(int addr, boolean v) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_endToken, v);}
    
  
 
  /** @generated */
  final Feature casFeat_typeOfSpeech;
  /** @generated */
  final int     casFeatCode_typeOfSpeech;
  /** @generated */ 
  public String getTypeOfSpeech(int addr) {
        if (featOkTst && casFeat_typeOfSpeech == null)
      jcas.throwFeatMissing("typeOfSpeech", "token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_typeOfSpeech);
  }
  /** @generated */    
  public void setTypeOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_typeOfSpeech == null)
      jcas.throwFeatMissing("typeOfSpeech", "token");
    ll_cas.ll_setStringValue(addr, casFeatCode_typeOfSpeech, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startToken = jcas.getRequiredFeatureDE(casType, "startToken", "uima.cas.Boolean", featOkTst);
    casFeatCode_startToken  = (null == casFeat_startToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startToken).getCode();

 
    casFeat_endToken = jcas.getRequiredFeatureDE(casType, "endToken", "uima.cas.Boolean", featOkTst);
    casFeatCode_endToken  = (null == casFeat_endToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endToken).getCode();

 
    casFeat_typeOfSpeech = jcas.getRequiredFeatureDE(casType, "typeOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_typeOfSpeech  = (null == casFeat_typeOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_typeOfSpeech).getCode();

  }
}



    
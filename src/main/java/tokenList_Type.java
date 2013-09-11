
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
import org.apache.uima.jcas.cas.StringList_Type;

/** list of all the tokens in the answer or a question.
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class tokenList_Type extends StringList_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (tokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = tokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new tokenList(addr, tokenList_Type.this);
  			   tokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new tokenList(addr, tokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = tokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("tokenList");
 
  /** @generated */
  final Feature casFeat_token;
  /** @generated */
  final int     casFeatCode_token;
  /** @generated */ 
  public int getToken(int addr) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "tokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token);
  }
  /** @generated */    
  public void setToken(int addr, int v) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "tokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_token, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nGramList;
  /** @generated */
  final int     casFeatCode_nGramList;
  /** @generated */ 
  public int getNGramList(int addr) {
        if (featOkTst && casFeat_nGramList == null)
      jcas.throwFeatMissing("nGramList", "tokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nGramList);
  }
  /** @generated */    
  public void setNGramList(int addr, int v) {
        if (featOkTst && casFeat_nGramList == null)
      jcas.throwFeatMissing("nGramList", "tokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_nGramList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public tokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_token = jcas.getRequiredFeatureDE(casType, "token", "token", featOkTst);
    casFeatCode_token  = (null == casFeat_token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token).getCode();

 
    casFeat_nGramList = jcas.getRequiredFeatureDE(casType, "nGramList", "nGramList", featOkTst);
    casFeatCode_nGramList  = (null == casFeat_nGramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGramList).getCode();

  }
}



    
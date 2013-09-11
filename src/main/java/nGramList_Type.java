
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

/** A list of word or phrase combinations from a list of tokens with a specific cardinality. e.g. given the following set: "I am a legend", the list of elements in nGramList witha cardinality of two would be would be as follows: 

"I am" "am a" "a legend"  "I a" "I legend" "am legend"
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * @generated */
public class nGramList_Type extends StringList_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (nGramList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = nGramList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new nGramList(addr, nGramList_Type.this);
  			   nGramList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new nGramList(addr, nGramList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = nGramList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("nGramList");
 
  /** @generated */
  final Feature casFeat_Phrase;
  /** @generated */
  final int     casFeatCode_Phrase;
  /** @generated */ 
  public String getPhrase(int addr) {
        if (featOkTst && casFeat_Phrase == null)
      jcas.throwFeatMissing("Phrase", "nGramList");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Phrase);
  }
  /** @generated */    
  public void setPhrase(int addr, String v) {
        if (featOkTst && casFeat_Phrase == null)
      jcas.throwFeatMissing("Phrase", "nGramList");
    ll_cas.ll_setStringValue(addr, casFeatCode_Phrase, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numOfWords;
  /** @generated */
  final int     casFeatCode_numOfWords;
  /** @generated */ 
  public int getNumOfWords(int addr) {
        if (featOkTst && casFeat_numOfWords == null)
      jcas.throwFeatMissing("numOfWords", "nGramList");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numOfWords);
  }
  /** @generated */    
  public void setNumOfWords(int addr, int v) {
        if (featOkTst && casFeat_numOfWords == null)
      jcas.throwFeatMissing("numOfWords", "nGramList");
    ll_cas.ll_setIntValue(addr, casFeatCode_numOfWords, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public nGramList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Phrase = jcas.getRequiredFeatureDE(casType, "Phrase", "nGram", featOkTst);
    casFeatCode_Phrase  = (null == casFeat_Phrase) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Phrase).getCode();

 
    casFeat_numOfWords = jcas.getRequiredFeatureDE(casType, "numOfWords", "uima.cas.Integer", featOkTst);
    casFeatCode_numOfWords  = (null == casFeat_numOfWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numOfWords).getCode();

  }
}



    
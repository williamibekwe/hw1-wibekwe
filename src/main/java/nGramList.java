

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** A list of word or phrase combinations from a list of tokens with a specific cardinality. e.g. given the following set: "I am a legend", the list of elements in nGramList witha cardinality of two would be would be as follows: 

"I am" "am a" "a legend"  "I a" "I legend" "am legend"
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class nGramList extends StringList {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(nGramList.class);
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
  protected nGramList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public nGramList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public nGramList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Phrase

  /** getter for Phrase - gets A specific ngram out of the cardinal set of ngrams
   * @generated */
  public String getPhrase() {
    if (nGramList_Type.featOkTst && ((nGramList_Type)jcasType).casFeat_Phrase == null)
      jcasType.jcas.throwFeatMissing("Phrase", "nGramList");
    return jcasType.ll_cas.ll_getStringValue(addr, ((nGramList_Type)jcasType).casFeatCode_Phrase);}
    
  /** setter for Phrase - sets A specific ngram out of the cardinal set of ngrams 
   * @generated */
  public void setPhrase(String v) {
    if (nGramList_Type.featOkTst && ((nGramList_Type)jcasType).casFeat_Phrase == null)
      jcasType.jcas.throwFeatMissing("Phrase", "nGramList");
    jcasType.ll_cas.ll_setStringValue(addr, ((nGramList_Type)jcasType).casFeatCode_Phrase, v);}    
   
    
  //*--------------*
  //* Feature: numOfWords

  /** getter for numOfWords - gets number of the words in each nGramList element
   * @generated */
  public int getNumOfWords() {
    if (nGramList_Type.featOkTst && ((nGramList_Type)jcasType).casFeat_numOfWords == null)
      jcasType.jcas.throwFeatMissing("numOfWords", "nGramList");
    return jcasType.ll_cas.ll_getIntValue(addr, ((nGramList_Type)jcasType).casFeatCode_numOfWords);}
    
  /** setter for numOfWords - sets number of the words in each nGramList element 
   * @generated */
  public void setNumOfWords(int v) {
    if (nGramList_Type.featOkTst && ((nGramList_Type)jcasType).casFeat_numOfWords == null)
      jcasType.jcas.throwFeatMissing("numOfWords", "nGramList");
    jcasType.ll_cas.ll_setIntValue(addr, ((nGramList_Type)jcasType).casFeatCode_numOfWords, v);}    
  }

    
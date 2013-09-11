

/* First created by JCasGen Wed Sep 11 16:56:59 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** a word that consists of a combination of ascii symbols.
 * Updated by JCasGen Wed Sep 11 16:56:59 EDT 2013
 * XML source: /Users/willibeamin/Documents/workspace/hw1-wibekwe/src/main/resources/hw1-wibekwe-typesystem.xml
 * @generated */
public class token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(token.class);
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
  protected token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public token(JCas jcas, int begin, int end) {
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
  //* Feature: startToken

  /** getter for startToken - gets check whether or not the token is a start word
   * @generated */
  public boolean getStartToken() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((token_Type)jcasType).casFeatCode_startToken);}
    
  /** setter for startToken - sets check whether or not the token is a start word 
   * @generated */
  public void setStartToken(boolean v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((token_Type)jcasType).casFeatCode_startToken, v);}    
   
    
  //*--------------*
  //* Feature: endToken

  /** getter for endToken - gets check whether or not the token is an end word
   * @generated */
  public boolean getEndToken() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((token_Type)jcasType).casFeatCode_endToken);}
    
  /** setter for endToken - sets check whether or not the token is an end word 
   * @generated */
  public void setEndToken(boolean v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((token_Type)jcasType).casFeatCode_endToken, v);}    
   
    
  //*--------------*
  //* Feature: typeOfSpeech

  /** getter for typeOfSpeech - gets associates token to a type of speech
   * @generated */
  public String getTypeOfSpeech() {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_typeOfSpeech == null)
      jcasType.jcas.throwFeatMissing("typeOfSpeech", "token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token_Type)jcasType).casFeatCode_typeOfSpeech);}
    
  /** setter for typeOfSpeech - sets associates token to a type of speech 
   * @generated */
  public void setTypeOfSpeech(String v) {
    if (token_Type.featOkTst && ((token_Type)jcasType).casFeat_typeOfSpeech == null)
      jcasType.jcas.throwFeatMissing("typeOfSpeech", "token");
    jcasType.ll_cas.ll_setStringValue(addr, ((token_Type)jcasType).casFeatCode_typeOfSpeech, v);}    
  }

    
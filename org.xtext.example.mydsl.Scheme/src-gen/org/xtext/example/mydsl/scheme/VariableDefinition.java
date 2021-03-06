/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.VariableDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.VariableDefinition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.VariableDefinition#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.VariableDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.VariableDefinition#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.VariableDefinition#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.VariableDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.VariableDefinition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getVariableDefinition_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.VariableDefinition#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

} // VariableDefinition

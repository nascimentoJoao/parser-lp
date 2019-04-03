/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.Definition#getVariableDefinition <em>Variable Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Definition</em>' containment reference.
   * @see #setVariableDefinition(VariableDefinition)
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getDefinition_VariableDefinition()
   * @model containment="true"
   * @generated
   */
  VariableDefinition getVariableDefinition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.scheme.Definition#getVariableDefinition <em>Variable Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Definition</em>' containment reference.
   * @see #getVariableDefinition()
   * @generated
   */
  void setVariableDefinition(VariableDefinition value);

} // Definition

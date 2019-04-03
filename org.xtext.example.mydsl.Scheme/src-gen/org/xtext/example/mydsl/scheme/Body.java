/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.Body#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.scheme.Body#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Definition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getBody_Definition()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinition();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getBody_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // Body
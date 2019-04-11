/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.scheme.ListLength#getListNumbers <em>List Numbers</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.scheme.SchemePackage#getListLength()
 * @model
 * @generated
 */
public interface ListLength extends EObject
{
  /**
   * Returns the value of the '<em><b>List Numbers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.scheme.ListNumbers}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Numbers</em>' containment reference list.
   * @see org.xtext.example.mydsl.scheme.SchemePackage#getListLength_ListNumbers()
   * @model containment="true"
   * @generated
   */
  EList<ListNumbers> getListNumbers();

} // ListLength

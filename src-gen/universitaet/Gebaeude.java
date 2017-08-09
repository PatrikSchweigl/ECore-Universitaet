/**
 */
package universitaet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Gebaeude#getGebaeudeKennung <em>Gebaeude Kennung</em>}</li>
 *   <li>{@link universitaet.Gebaeude#getRaeume <em>Raeume</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getGebaeude()
 * @model
 * @generated
 */
public interface Gebaeude extends Entity {
	/**
	 * Returns the value of the '<em><b>Gebaeude Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gebaeude Kennung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gebaeude Kennung</em>' attribute.
	 * @see #setGebaeudeKennung(String)
	 * @see universitaet.UniversitaetPackage#getGebaeude_GebaeudeKennung()
	 * @model
	 * @generated
	 */
	String getGebaeudeKennung();

	/**
	 * Sets the value of the '{@link universitaet.Gebaeude#getGebaeudeKennung <em>Gebaeude Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gebaeude Kennung</em>' attribute.
	 * @see #getGebaeudeKennung()
	 * @generated
	 */
	void setGebaeudeKennung(String value);

	/**
	 * Returns the value of the '<em><b>Raeume</b></em>' reference list.
	 * The list contents are of type {@link universitaet.Raum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raeume</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raeume</em>' reference list.
	 * @see universitaet.UniversitaetPackage#getGebaeude_Raeume()
	 * @model
	 * @generated
	 */
	EList<Raum> getRaeume();

} // Gebaeude

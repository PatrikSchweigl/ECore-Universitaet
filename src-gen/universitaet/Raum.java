/**
 */
package universitaet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universitaet.Raum#getRaumKennung <em>Raum Kennung</em>}</li>
 *   <li>{@link universitaet.Raum#getVorlesungen <em>Vorlesungen</em>}</li>
 * </ul>
 *
 * @see universitaet.UniversitaetPackage#getRaum()
 * @model
 * @generated
 */
public interface Raum extends Entity {
	/**
	 * Returns the value of the '<em><b>Raum Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raum Kennung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raum Kennung</em>' attribute.
	 * @see #setRaumKennung(String)
	 * @see universitaet.UniversitaetPackage#getRaum_RaumKennung()
	 * @model
	 * @generated
	 */
	String getRaumKennung();

	/**
	 * Sets the value of the '{@link universitaet.Raum#getRaumKennung <em>Raum Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raum Kennung</em>' attribute.
	 * @see #getRaumKennung()
	 * @generated
	 */
	void setRaumKennung(String value);

	/**
	 * Returns the value of the '<em><b>Vorlesungen</b></em>' containment reference list.
	 * The list contents are of type {@link universitaet.Vorlesung}.
	 * It is bidirectional and its opposite is '{@link universitaet.Vorlesung#getRaum <em>Raum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesungen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesungen</em>' containment reference list.
	 * @see universitaet.UniversitaetPackage#getRaum_Vorlesungen()
	 * @see universitaet.Vorlesung#getRaum
	 * @model opposite="Raum" containment="true"
	 * @generated
	 */
	EList<Vorlesung> getVorlesungen();

} // Raum

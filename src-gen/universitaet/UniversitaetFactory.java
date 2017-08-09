/**
 */
package universitaet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see universitaet.UniversitaetPackage
 * @generated
 */
public interface UniversitaetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversitaetFactory eINSTANCE = universitaet.impl.UniversitaetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mitarbeiter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mitarbeiter</em>'.
	 * @generated
	 */
	Mitarbeiter createMitarbeiter();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Vorlesung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vorlesung</em>'.
	 * @generated
	 */
	Vorlesung createVorlesung();

	/**
	 * Returns a new object of class '<em>Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gebaeude</em>'.
	 * @generated
	 */
	Gebaeude createGebaeude();

	/**
	 * Returns a new object of class '<em>Raum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raum</em>'.
	 * @generated
	 */
	Raum createRaum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversitaetPackage getUniversitaetPackage();

} //UniversitaetFactory

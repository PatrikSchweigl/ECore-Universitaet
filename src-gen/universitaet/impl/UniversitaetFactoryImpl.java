/**
 */
package universitaet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universitaet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversitaetFactoryImpl extends EFactoryImpl implements UniversitaetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversitaetFactory init() {
		try {
			UniversitaetFactory theUniversitaetFactory = (UniversitaetFactory) EPackage.Registry.INSTANCE
					.getEFactory(UniversitaetPackage.eNS_URI);
			if (theUniversitaetFactory != null) {
				return theUniversitaetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversitaetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversitaetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UniversitaetPackage.MITARBEITER:
			return createMitarbeiter();
		case UniversitaetPackage.STUDENT:
			return createStudent();
		case UniversitaetPackage.VORLESUNG:
			return createVorlesung();
		case UniversitaetPackage.GEBAEUDE:
			return createGebaeude();
		case UniversitaetPackage.RAUM:
			return createRaum();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UniversitaetPackage.ARBEITSVERHAELTNIS:
			return createArbeitsverhaeltnisFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UniversitaetPackage.ARBEITSVERHAELTNIS:
			return convertArbeitsverhaeltnisToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mitarbeiter createMitarbeiter() {
		MitarbeiterImpl mitarbeiter = new MitarbeiterImpl();
		return mitarbeiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vorlesung createVorlesung() {
		VorlesungImpl vorlesung = new VorlesungImpl();
		return vorlesung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gebaeude createGebaeude() {
		GebaeudeImpl gebaeude = new GebaeudeImpl();
		return gebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raum createRaum() {
		RaumImpl raum = new RaumImpl();
		return raum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbeitsverhaeltnis createArbeitsverhaeltnisFromString(EDataType eDataType, String initialValue) {
		Arbeitsverhaeltnis result = Arbeitsverhaeltnis.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArbeitsverhaeltnisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversitaetPackage getUniversitaetPackage() {
		return (UniversitaetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversitaetPackage getPackage() {
		return UniversitaetPackage.eINSTANCE;
	}

} //UniversitaetFactoryImpl

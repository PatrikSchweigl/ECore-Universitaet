/**
 */
package universitaet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import universitaet.Arbeitsverhaeltnis;
import universitaet.Entity;
import universitaet.Gebaeude;
import universitaet.Mitarbeiter;
import universitaet.Raum;
import universitaet.Student;
import universitaet.UniversitaetFactory;
import universitaet.UniversitaetPackage;
import universitaet.User;
import universitaet.Vorlesung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversitaetPackageImpl extends EPackageImpl implements UniversitaetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitarbeiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorlesungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gebaeudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arbeitsverhaeltnisEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see universitaet.UniversitaetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversitaetPackageImpl() {
		super(eNS_URI, UniversitaetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UniversitaetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversitaetPackage init() {
		if (isInited)
			return (UniversitaetPackage) EPackage.Registry.INSTANCE.getEPackage(UniversitaetPackage.eNS_URI);

		// Obtain or create and register package
		UniversitaetPackageImpl theUniversitaetPackage = (UniversitaetPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UniversitaetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new UniversitaetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUniversitaetPackage.createPackageContents();

		// Initialize created meta-data
		theUniversitaetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniversitaetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversitaetPackage.eNS_URI, theUniversitaetPackage);
		return theUniversitaetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_ID() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Ausblenden() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Vorname() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Nachname() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitarbeiter() {
		return mitarbeiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMitarbeiter_MitarbeiterKennung() {
		return (EAttribute) mitarbeiterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMitarbeiter_Arbeitsverhaeltnis() {
		return (EAttribute) mitarbeiterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Matrikelnummer() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Semester() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVorlesung() {
		return vorlesungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVorlesung_VorlesungKennung() {
		return (EAttribute) vorlesungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Mitarbeiter() {
		return (EReference) vorlesungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Studenten() {
		return (EReference) vorlesungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Raum() {
		return (EReference) vorlesungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGebaeude() {
		return gebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGebaeude_GebaeudeKennung() {
		return (EAttribute) gebaeudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGebaeude_Raeume() {
		return (EReference) gebaeudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaum() {
		return raumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRaum_RaumKennung() {
		return (EAttribute) raumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaum_Vorlesungen() {
		return (EReference) raumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArbeitsverhaeltnis() {
		return arbeitsverhaeltnisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversitaetFactory getUniversitaetFactory() {
		return (UniversitaetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ID);
		createEAttribute(entityEClass, ENTITY__AUSBLENDEN);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__VORNAME);
		createEAttribute(userEClass, USER__NACHNAME);

		mitarbeiterEClass = createEClass(MITARBEITER);
		createEAttribute(mitarbeiterEClass, MITARBEITER__MITARBEITER_KENNUNG);
		createEAttribute(mitarbeiterEClass, MITARBEITER__ARBEITSVERHAELTNIS);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__MATRIKELNUMMER);
		createEAttribute(studentEClass, STUDENT__SEMESTER);

		vorlesungEClass = createEClass(VORLESUNG);
		createEAttribute(vorlesungEClass, VORLESUNG__VORLESUNG_KENNUNG);
		createEReference(vorlesungEClass, VORLESUNG__MITARBEITER);
		createEReference(vorlesungEClass, VORLESUNG__STUDENTEN);
		createEReference(vorlesungEClass, VORLESUNG__RAUM);

		gebaeudeEClass = createEClass(GEBAEUDE);
		createEAttribute(gebaeudeEClass, GEBAEUDE__GEBAEUDE_KENNUNG);
		createEReference(gebaeudeEClass, GEBAEUDE__RAEUME);

		raumEClass = createEClass(RAUM);
		createEAttribute(raumEClass, RAUM__RAUM_KENNUNG);
		createEReference(raumEClass, RAUM__VORLESUNGEN);

		// Create enums
		arbeitsverhaeltnisEEnum = createEEnum(ARBEITSVERHAELTNIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userEClass.getESuperTypes().add(this.getEntity());
		mitarbeiterEClass.getESuperTypes().add(this.getUser());
		studentEClass.getESuperTypes().add(this.getUser());
		vorlesungEClass.getESuperTypes().add(this.getEntity());
		gebaeudeEClass.getESuperTypes().add(this.getEntity());
		raumEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Ausblenden(), ecorePackage.getEBoolean(), "ausblenden", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Vorname(), ecorePackage.getEString(), "Vorname", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Nachname(), ecorePackage.getEString(), "Nachname", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitarbeiterEClass, Mitarbeiter.class, "Mitarbeiter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMitarbeiter_MitarbeiterKennung(), ecorePackage.getEString(), "MitarbeiterKennung", null, 0, 1,
				Mitarbeiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMitarbeiter_Arbeitsverhaeltnis(), this.getArbeitsverhaeltnis(), "Arbeitsverhaeltnis", null, 0,
				1, Mitarbeiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Matrikelnummer(), ecorePackage.getEString(), "Matrikelnummer", null, 0, 1,
				Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Semester(), ecorePackage.getEInt(), "Semester", null, 0, 1, Student.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorlesungEClass, Vorlesung.class, "Vorlesung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVorlesung_VorlesungKennung(), ecorePackage.getEString(), "VorlesungKennung", null, 0, 1,
				Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Mitarbeiter(), this.getMitarbeiter(), null, "Mitarbeiter", null, 1, 1,
				Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Studenten(), this.getStudent(), null, "Studenten", null, 0, -1, Vorlesung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Raum(), this.getRaum(), this.getRaum_Vorlesungen(), "Raum", null, 1, 1,
				Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gebaeudeEClass, Gebaeude.class, "Gebaeude", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGebaeude_GebaeudeKennung(), ecorePackage.getEString(), "GebaeudeKennung", null, 0, 1,
				Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGebaeude_Raeume(), this.getRaum(), null, "Raeume", null, 0, -1, Gebaeude.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(raumEClass, Raum.class, "Raum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRaum_RaumKennung(), ecorePackage.getEString(), "RaumKennung", null, 0, 1, Raum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRaum_Vorlesungen(), this.getVorlesung(), this.getVorlesung_Raum(), "Vorlesungen", null, 0, -1,
				Raum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arbeitsverhaeltnisEEnum, Arbeitsverhaeltnis.class, "Arbeitsverhaeltnis");
		addEEnumLiteral(arbeitsverhaeltnisEEnum, Arbeitsverhaeltnis.PROFESSOR);
		addEEnumLiteral(arbeitsverhaeltnisEEnum, Arbeitsverhaeltnis.ASSISTENT_PROFESSOR);
		addEEnumLiteral(arbeitsverhaeltnisEEnum, Arbeitsverhaeltnis.POST_DOC);

		// Create resource
		createResource(eNS_URI);
	}

} //UniversitaetPackageImpl

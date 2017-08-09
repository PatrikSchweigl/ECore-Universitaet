/**
 */
package universitaet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arbeitsverhaeltnis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see universitaet.UniversitaetPackage#getArbeitsverhaeltnis()
 * @model
 * @generated
 */
public enum Arbeitsverhaeltnis implements Enumerator {
	/**
	 * The '<em><b>Professor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSOR(0, "Professor", ""),

	/**
	 * The '<em><b>Assistent Professor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSISTENT_PROFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	ASSISTENT_PROFESSOR(1, "AssistentProfessor", "AssistentProfessor"),

	/**
	 * The '<em><b>Post Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	POST_DOC(2, "PostDoc", "PostDoc");

	/**
	 * The '<em><b>Professor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Professor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROFESSOR
	 * @model name="Professor" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSOR_VALUE = 0;

	/**
	 * The '<em><b>Assistent Professor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assistent Professor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSISTENT_PROFESSOR
	 * @model name="AssistentProfessor"
	 * @generated
	 * @ordered
	 */
	public static final int ASSISTENT_PROFESSOR_VALUE = 1;

	/**
	 * The '<em><b>Post Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Doc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_DOC
	 * @model name="PostDoc"
	 * @generated
	 * @ordered
	 */
	public static final int POST_DOC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Arbeitsverhaeltnis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Arbeitsverhaeltnis[] VALUES_ARRAY = new Arbeitsverhaeltnis[] { PROFESSOR, ASSISTENT_PROFESSOR,
			POST_DOC, };

	/**
	 * A public read-only list of all the '<em><b>Arbeitsverhaeltnis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Arbeitsverhaeltnis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arbeitsverhaeltnis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Arbeitsverhaeltnis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Arbeitsverhaeltnis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arbeitsverhaeltnis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Arbeitsverhaeltnis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Arbeitsverhaeltnis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arbeitsverhaeltnis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Arbeitsverhaeltnis get(int value) {
		switch (value) {
		case PROFESSOR_VALUE:
			return PROFESSOR;
		case ASSISTENT_PROFESSOR_VALUE:
			return ASSISTENT_PROFESSOR;
		case POST_DOC_VALUE:
			return POST_DOC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Arbeitsverhaeltnis(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Arbeitsverhaeltnis

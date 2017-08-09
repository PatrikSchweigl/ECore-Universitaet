/**
 */
package universitaet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universitaet.Arbeitsverhaeltnis;
import universitaet.Mitarbeiter;
import universitaet.UniversitaetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitarbeiter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.MitarbeiterImpl#getMitarbeiterKennung <em>Mitarbeiter Kennung</em>}</li>
 *   <li>{@link universitaet.impl.MitarbeiterImpl#getArbeitsverhaeltnis <em>Arbeitsverhaeltnis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitarbeiterImpl extends UserImpl implements Mitarbeiter {
	/**
	 * The default value of the '{@link #getMitarbeiterKennung() <em>Mitarbeiter Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitarbeiterKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String MITARBEITER_KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMitarbeiterKennung() <em>Mitarbeiter Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitarbeiterKennung()
	 * @generated
	 * @ordered
	 */
	protected String mitarbeiterKennung = MITARBEITER_KENNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getArbeitsverhaeltnis() <em>Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected static final Arbeitsverhaeltnis ARBEITSVERHAELTNIS_EDEFAULT = Arbeitsverhaeltnis.PROFESSOR;

	/**
	 * The cached value of the '{@link #getArbeitsverhaeltnis() <em>Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected Arbeitsverhaeltnis arbeitsverhaeltnis = ARBEITSVERHAELTNIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitarbeiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.MITARBEITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMitarbeiterKennung() {
		return mitarbeiterKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMitarbeiterKennung(String newMitarbeiterKennung) {
		String oldMitarbeiterKennung = mitarbeiterKennung;
		mitarbeiterKennung = newMitarbeiterKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.MITARBEITER__MITARBEITER_KENNUNG,
					oldMitarbeiterKennung, mitarbeiterKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbeitsverhaeltnis getArbeitsverhaeltnis() {
		return arbeitsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArbeitsverhaeltnis(Arbeitsverhaeltnis newArbeitsverhaeltnis) {
		Arbeitsverhaeltnis oldArbeitsverhaeltnis = arbeitsverhaeltnis;
		arbeitsverhaeltnis = newArbeitsverhaeltnis == null ? ARBEITSVERHAELTNIS_EDEFAULT : newArbeitsverhaeltnis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.MITARBEITER__ARBEITSVERHAELTNIS,
					oldArbeitsverhaeltnis, arbeitsverhaeltnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.MITARBEITER__MITARBEITER_KENNUNG:
			return getMitarbeiterKennung();
		case UniversitaetPackage.MITARBEITER__ARBEITSVERHAELTNIS:
			return getArbeitsverhaeltnis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UniversitaetPackage.MITARBEITER__MITARBEITER_KENNUNG:
			setMitarbeiterKennung((String) newValue);
			return;
		case UniversitaetPackage.MITARBEITER__ARBEITSVERHAELTNIS:
			setArbeitsverhaeltnis((Arbeitsverhaeltnis) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UniversitaetPackage.MITARBEITER__MITARBEITER_KENNUNG:
			setMitarbeiterKennung(MITARBEITER_KENNUNG_EDEFAULT);
			return;
		case UniversitaetPackage.MITARBEITER__ARBEITSVERHAELTNIS:
			setArbeitsverhaeltnis(ARBEITSVERHAELTNIS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UniversitaetPackage.MITARBEITER__MITARBEITER_KENNUNG:
			return MITARBEITER_KENNUNG_EDEFAULT == null ? mitarbeiterKennung != null
					: !MITARBEITER_KENNUNG_EDEFAULT.equals(mitarbeiterKennung);
		case UniversitaetPackage.MITARBEITER__ARBEITSVERHAELTNIS:
			return arbeitsverhaeltnis != ARBEITSVERHAELTNIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (MitarbeiterKennung: ");
		result.append(mitarbeiterKennung);
		result.append(", Arbeitsverhaeltnis: ");
		result.append(arbeitsverhaeltnis);
		result.append(')');
		return result.toString();
	}

} //MitarbeiterImpl

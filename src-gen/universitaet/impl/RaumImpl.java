/**
 */
package universitaet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import universitaet.Raum;
import universitaet.UniversitaetPackage;
import universitaet.Vorlesung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.RaumImpl#getRaumKennung <em>Raum Kennung</em>}</li>
 *   <li>{@link universitaet.impl.RaumImpl#getVorlesungen <em>Vorlesungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RaumImpl extends EntityImpl implements Raum {
	/**
	 * The default value of the '{@link #getRaumKennung() <em>Raum Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaumKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String RAUM_KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaumKennung() <em>Raum Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaumKennung()
	 * @generated
	 * @ordered
	 */
	protected String raumKennung = RAUM_KENNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVorlesungen() <em>Vorlesungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorlesungen()
	 * @generated
	 * @ordered
	 */
	protected EList<Vorlesung> vorlesungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.RAUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaumKennung() {
		return raumKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaumKennung(String newRaumKennung) {
		String oldRaumKennung = raumKennung;
		raumKennung = newRaumKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.RAUM__RAUM_KENNUNG,
					oldRaumKennung, raumKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vorlesung> getVorlesungen() {
		if (vorlesungen == null) {
			vorlesungen = new EObjectContainmentWithInverseEList<Vorlesung>(Vorlesung.class, this,
					UniversitaetPackage.RAUM__VORLESUNGEN, UniversitaetPackage.VORLESUNG__RAUM);
		}
		return vorlesungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVorlesungen()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			return ((InternalEList<?>) getVorlesungen()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.RAUM__RAUM_KENNUNG:
			return getRaumKennung();
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			return getVorlesungen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UniversitaetPackage.RAUM__RAUM_KENNUNG:
			setRaumKennung((String) newValue);
			return;
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			getVorlesungen().clear();
			getVorlesungen().addAll((Collection<? extends Vorlesung>) newValue);
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
		case UniversitaetPackage.RAUM__RAUM_KENNUNG:
			setRaumKennung(RAUM_KENNUNG_EDEFAULT);
			return;
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			getVorlesungen().clear();
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
		case UniversitaetPackage.RAUM__RAUM_KENNUNG:
			return RAUM_KENNUNG_EDEFAULT == null ? raumKennung != null : !RAUM_KENNUNG_EDEFAULT.equals(raumKennung);
		case UniversitaetPackage.RAUM__VORLESUNGEN:
			return vorlesungen != null && !vorlesungen.isEmpty();
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
		result.append(" (RaumKennung: ");
		result.append(raumKennung);
		result.append(')');
		return result.toString();
	}

} //RaumImpl

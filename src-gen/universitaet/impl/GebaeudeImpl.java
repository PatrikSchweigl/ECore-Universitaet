/**
 */
package universitaet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universitaet.Gebaeude;
import universitaet.Raum;
import universitaet.UniversitaetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universitaet.impl.GebaeudeImpl#getGebaeudeKennung <em>Gebaeude Kennung</em>}</li>
 *   <li>{@link universitaet.impl.GebaeudeImpl#getRaeume <em>Raeume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GebaeudeImpl extends EntityImpl implements Gebaeude {
	/**
	 * The default value of the '{@link #getGebaeudeKennung() <em>Gebaeude Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeudeKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBAEUDE_KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGebaeudeKennung() <em>Gebaeude Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeudeKennung()
	 * @generated
	 * @ordered
	 */
	protected String gebaeudeKennung = GEBAEUDE_KENNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRaeume() <em>Raeume</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeume()
	 * @generated
	 * @ordered
	 */
	protected EList<Raum> raeume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitaetPackage.Literals.GEBAEUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGebaeudeKennung() {
		return gebaeudeKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGebaeudeKennung(String newGebaeudeKennung) {
		String oldGebaeudeKennung = gebaeudeKennung;
		gebaeudeKennung = newGebaeudeKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitaetPackage.GEBAEUDE__GEBAEUDE_KENNUNG,
					oldGebaeudeKennung, gebaeudeKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Raum> getRaeume() {
		if (raeume == null) {
			raeume = new EObjectResolvingEList<Raum>(Raum.class, this, UniversitaetPackage.GEBAEUDE__RAEUME);
		}
		return raeume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversitaetPackage.GEBAEUDE__GEBAEUDE_KENNUNG:
			return getGebaeudeKennung();
		case UniversitaetPackage.GEBAEUDE__RAEUME:
			return getRaeume();
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
		case UniversitaetPackage.GEBAEUDE__GEBAEUDE_KENNUNG:
			setGebaeudeKennung((String) newValue);
			return;
		case UniversitaetPackage.GEBAEUDE__RAEUME:
			getRaeume().clear();
			getRaeume().addAll((Collection<? extends Raum>) newValue);
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
		case UniversitaetPackage.GEBAEUDE__GEBAEUDE_KENNUNG:
			setGebaeudeKennung(GEBAEUDE_KENNUNG_EDEFAULT);
			return;
		case UniversitaetPackage.GEBAEUDE__RAEUME:
			getRaeume().clear();
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
		case UniversitaetPackage.GEBAEUDE__GEBAEUDE_KENNUNG:
			return GEBAEUDE_KENNUNG_EDEFAULT == null ? gebaeudeKennung != null
					: !GEBAEUDE_KENNUNG_EDEFAULT.equals(gebaeudeKennung);
		case UniversitaetPackage.GEBAEUDE__RAEUME:
			return raeume != null && !raeume.isEmpty();
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
		result.append(" (GebaeudeKennung: ");
		result.append(gebaeudeKennung);
		result.append(')');
		return result.toString();
	}

} //GebaeudeImpl

package org.kapott.hbci.passport;

/**
 * Gemeinsames Interface fuer chipkarten-basiere Passports.
 * Derzeit sind das HBCIPassportDDV, HBCIPassportDDVPCSC und HBCIPassportRSA.
 */
public interface HBCIPassportChipcard extends HBCIPassport
{
    /**
     * Schreiben der aktuellen Zugangsdaten auf die Chipkarte. Werden Zugangsdaten
     * des Passport ver�ndert (z.B. mit {@link org.kapott.hbci.passport.HBCIPassport#setHost(String)},
     * so werden diese Daten durch die Methode {@link org.kapott.hbci.passport.HBCIPassport#saveChanges()}
     * <em>nicht</em> auf der Chipkarte gespeichert. Durch Aufruf dieser Methode
     * wird das Schreiben der aktuellen Zugangsdaten erzwungen. Zu den hiervon
     * betroffenen Daten z�hlen der L�ndercode der Bank, die Bankleitzahl,
     * die Hostadresse des HBCI-Servers sowie die User-ID zur Anmeldung am
     * HBCI-Server.
     */
    public void saveBankData();
    
    /**
     * Gibt den Dateinamen f�r die zus�tzliche Schl�sseldatei zur�ck.
     * Diese Datei enth�lt gecachte Daten, um das Initialisieren eines
     * {@link org.kapott.hbci.manager.HBCIHandler} mit einem DDV-Passport zu
     * beschleunigen. Defaultm��ig setzt sich der Dateiname aus einem
     * definiertbaren Prefix (Pfad) und der Seriennummer der Chipkarte zusammen.
     * Da diese Datei vertrauliche Daten enth�lt (z.B. die Kontodaten des
     * Bankkunden), wird diese Datei verschl�sselt. Vor dem erstmaligen Lesen
     * bzw. beim Erzeugen dieser Datei wird deshalb via Callback-Mechanismus
     * nach einem Passwort gefragt, das zur Erzeugung des kryptografischen
     * Schl�ssels f�r die Verschl�sselung benutzt wird.
     * @return Dateiname der Cache-Datei
     */
    public String getFileName();

    /**
     * Legt den Dateinamen fuer die zusaetzliche Schluesseldatei fest.
     * @param filename
     */
    public void setFileName(String filename);
}



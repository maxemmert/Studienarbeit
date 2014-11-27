package org.kapott.hbci.GV.parsers;

import java.util.Properties;




/**
 * Abstrakte Basis-Klasse der SEPA PAIN-Parser.
 */
public abstract class AbstractSepaParser implements ISEPAParser
{
    /**
     * Speichert den Wert in den Properties.
     * @param props die Properties.
     * @param name das Property.
     * @param value der Wert.
     */
    void put(Properties props, Names name, String value)
    {
        props.setProperty(name.getValue(),value);
    }
}

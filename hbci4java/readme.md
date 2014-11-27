# [![Build Status](https://travis-ci.org/willuhn/hbci4java.svg?branch=master)](https://travis-ci.org/willuhn/hbci4java) HBCI4Java

## Vorab

Dies ist ein aktuell gepflegter Fork von [HBCI4Java](http://hbci4java.kapott.org/),
welcher u.a. in [Hibiscus](http://www.willuhn.de/products/hibiscus) und
[Pecunia-Banking](http://www.pecuniabanking.de/) zum Einsatz kommt.

## Kontakt

Unter https://groups.google.com/forum/?hl=de#!forum/hbci4java findet ihr die
zugeh�rige Mailingliste.

## Entstehung

Das SVN von hbci4java.kapott.org ist schon seit einiger Zeit nicht mehr
�ffentlich, weil da drin wegen HBCI4Java 3 grundlegende �nderungen
stattfinden (wobei ich nicht weiss, ob Stefan wirklich noch daran arbeitet)
F�r die letzte ver�ffentlichte Version 2.5.12 haben sich im Laufe der Zeit aber viele Patches
angesammelt, die auf http://hbci4java.kapott.org nicht ver�ffentlicht wurden.

Inzwischen enth�lt diese Fork hier nicht mehr nur Patches sondern auch umfangreiche
Weiterentwicklungen wie etwa 

- die Unterst�tzung der neuen TAN-Verfahren (smsTAN, chipTAN - incl. Implementierung des HHD-Standards mit Flicker-Code)
- Unterst�tzung von PC/SC-Kartenlesern via javax.smartcardio API
- eine aktuelle Bankenliste (mit BLZ, Server-Adresse, HBCI-Version,...)
- Unterst�tzung f�r alle aktuellen SEPA-PAIN-Versionen bei SEPA-�berweisungen
- erste Unterst�tzung f�r SEPA-Lastschriften und SEPA-Dauerauftr�ge 

Ausgangsbasis dieser Weiterentwicklung war HBCI4Java 2.5.12 mit einigen Patches von
Stefan (konkret seine SVN-Revision r227 vom 28.05.2010 - liegt im Ordner "log").
Im Ordner "log/patches" dieses Repositories hatte ich s�mtliche �nderungen in Form von
diff-Dateien gepflegt, um diese auch ohne Versionsverwaltungssystem noch nachvollziehen
zu k�nnen. Im Zuge der Erweiterungen am SEPA-Code wurde das jedoch zu umfangreich. Der
Ordner wurde zwischenzeitlich gel�scht. Die Historie der Weiterentwicklung kann �ber
die History des GIT-Repositories nachvollzogen werden.


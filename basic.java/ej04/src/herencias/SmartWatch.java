package herencias;

import clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    public long imeiReloj;
    public boolean datos;

    public SmartWatch() {
    }


    public SmartWatch(long imeiReloj, boolean datos, int imei, String marca, String modelo) {
        this.imeiReloj = imeiReloj;
        this.datos = datos;
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
}

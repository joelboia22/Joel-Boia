package br.com.lista2.q5.radiorelogio;

public interface Radio {
	public void setEmissora(String emissora, String tipoEmi);
    public String getEmissora();
    public String getTipoEmissora();
    public void setVolumeRadio(int vol);
    public int getVolumeRadio();

}

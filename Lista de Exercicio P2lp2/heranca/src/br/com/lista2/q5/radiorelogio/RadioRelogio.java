package br.com.lista2.q5.radiorelogio;

public class RadioRelogio implements Radio, Relogio {
	private String horario;
    private boolean despertar;
    private String horarioAlarme;
    private String emissora;
    private String tipoEmissora;
    private int volumeRadio;
    private int volumeRelogio;
    
    public RadioRelogio() {
        this.horario = "00:00";
        this.despertar = false;
        this.volumeRadio = 0;
        this.volumeRelogio = 0;
    }
    
    public void setEmissora(String emissora, String tipoEmissora) {
        this.emissora = emissora;
        this.tipoEmissora = tipoEmissora;
    }
    
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public boolean isDespertar() {
		return despertar;
	}
	public void setDespertar(boolean despertar) {
		this.despertar = despertar;
	}
	public String getHorarioAlarme() {
		return horarioAlarme;
	}
	public void setHorarioAlarme(String horarioAlarme) {
		this.horarioAlarme = horarioAlarme;
	}
	public String getEmissora() {
		return emissora;
	}
	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}
	public String getTipoEmissora() {
		return tipoEmissora;
	}
	public void setTipoEmissora(String tipoEmissora) {
		this.tipoEmissora = tipoEmissora;
	}
	public int getVolumeRadio() {
		return volumeRadio;
	}
	public void setVolumeRadio(int volumeRadio) {
		this.volumeRadio = volumeRadio;
	}
	public int getVolumeRelogio() {
		return volumeRelogio;
	}
	public void setVolumeRelogio(int volumeRelogio) {
		this.volumeRelogio = volumeRelogio;
	}

	@Override
	public void ligarAlarme() {
		this.despertar = true;
	}

	@Override
	public void desligarAlarme() {
		this.despertar = false;
	}

}

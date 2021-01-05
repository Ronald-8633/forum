package br.com.alura.forum.config.validacao;

public class ErroFormularioDto {

	private String campo;
	private String msg;

	public ErroFormularioDto(String campo, String msg) {
		this.campo = campo;
		this.msg = msg;
	}

	
	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

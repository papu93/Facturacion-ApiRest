package com.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAoKVhubdzx4M/oOAr1lfDegyH8zFc+Yy8ADqFQ0Ld5cHNIjVv\r\n" + 
			"DehaQtLo6DACSw+KaZDZOsyh9GBxoUPaODv6MY0anZ8/Fm8XkiOGsXsvf5wzXRw7\r\n" + 
			"4+EL4gfI5noTRhm0u1v/ZtzhxvKUOQor3tx0jT8Wot9zmpb7UQVOS+GKWFkFKdqH\r\n" + 
			"Bgv482+PRD8MLNYaVPbk20pQm8w5OqFQDBn+0OmX6mM1/4k976RgUDfd2RhU5+NO\r\n" + 
			"d45atiKV1xV1ZIirAZYLAjWKJKet03YuhMGkLmdMtNPMzYayMECcz/V9jm8TAtbY\r\n" + 
			"lt43aKpriQydyvpYEGNL/hecy4w0X0ucQMlYfwIDAQABAoIBAFMq67ojQLyUtXdL\r\n" + 
			"N0bDrv7bx/JepvzHIHmZ0m4tCwYs3E+OjE0N8tTPriau3DER/Z2DkQMA+AO1fn53\r\n" + 
			"y1z7qB7JJ3NdA2NQ5koRPGVcGg4dxvW4bUUfuHAviZHQt3O+UTQCf+o4BmdiJNyW\r\n" + 
			"6Hl7dpe9hrGRr57j9X5PmeZtAJuVwKTrjsWDyc/qKUd2HtZagjPwHG6V6iJV/2Xo\r\n" + 
			"K10ybCmHi9de8hiCHmL81OPLBIJGpX2e/LE7KV/v4I8gVaOUpdfxSaSv6tw7Ko7z\r\n" + 
			"2irLBU8FA4zRcRXApU0PqvGzo+Nwb6UWMvABGTdcWwChZNaTHEZJtQ2BICgqMilk\r\n" + 
			"V6d9ioECgYEA0PKPeyjS4Lw7+rYLQWIXYX8iQd86uuZ1OC7JUHT7msW5xPzXLwkM\r\n" + 
			"fIV8sJoSc9YoporiI1tE5nzJ6s1GrnpGR4shaHH+zfA4RQAktnBnriaxlTDRFYHH\r\n" + 
			"goabuc9hq6eoHtpRLKxysWecSp5p6vqYiYBJw1Eparajke5gHimRLMECgYEAxNJU\r\n" + 
			"aYeBdTRbbrJZI3OgOlCFLPsAfx+wIS6OBgYIx1qC6JVK8lS3oZp67PNvrc12ZPBy\r\n" + 
			"2V1P8iElqLbhLITZoNK3iJnBFEk24fZVD0WyBRrlDvkU3ORZkUToplvkZdqkX6SO\r\n" + 
			"79QGkzJ4wv6RH0x0hw/W7hx0SIqcVdh9FXDDlT8CgYAr2336X+tDeL8uNJ/QLYKy\r\n" + 
			"2DickvqE2HKqREfFN4jIR9BiZJ/WI5QXXv15JB3TapRFwMkOms2vg2nuev/nB4tQ\r\n" + 
			"4Qc2IRdWqqFk+k66bIWWrFCB/Ckm1oLGBvMQ4VKi8SH8t95p/hhk3FaV4wJgbBEw\r\n" + 
			"a1kQQizrVUKoEtzh99+dAQKBgFwX8klijy+RLQsRxmWxL5K5pGbUl3nkENyl1Ox6\r\n" + 
			"nFbzQfekC2pyO24RQ11l1qajUbePTp3obITl/6H+2EOlcdMvZZM0JkTgsR5vzYMU\r\n" + 
			"4GRFHlKwN5PYARTZAmb87lS+RlU+QWd0dRMg9aJ/zNWxR4D+51mI1Nwwh1AfuP90\r\n" + 
			"QP+vAoGBAM+U4ZSvLq/+NpwDmE8BD90S1PotD7Y4UAxCSC+Wc41gn5V0qhkMBy6+\r\n" + 
			"t2nFXmwrjxQ881SCmUesdTYreMM5a8w6/uSIqeLdOQuxM09/O5B+gMT9Yr5kXqRU\r\n" + 
			"4zbakognrtcMWIkdTUHg8faDUzIF3KaGV++NWKnx47F0bBm8h25p\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoKVhubdzx4M/oOAr1lfD\r\n" + 
			"egyH8zFc+Yy8ADqFQ0Ld5cHNIjVvDehaQtLo6DACSw+KaZDZOsyh9GBxoUPaODv6\r\n" + 
			"MY0anZ8/Fm8XkiOGsXsvf5wzXRw74+EL4gfI5noTRhm0u1v/ZtzhxvKUOQor3tx0\r\n" + 
			"jT8Wot9zmpb7UQVOS+GKWFkFKdqHBgv482+PRD8MLNYaVPbk20pQm8w5OqFQDBn+\r\n" + 
			"0OmX6mM1/4k976RgUDfd2RhU5+NOd45atiKV1xV1ZIirAZYLAjWKJKet03YuhMGk\r\n" + 
			"LmdMtNPMzYayMECcz/V9jm8TAtbYlt43aKpriQydyvpYEGNL/hecy4w0X0ucQMlY\r\n" + 
			"fwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}

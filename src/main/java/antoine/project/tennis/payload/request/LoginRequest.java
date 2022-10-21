package antoine.project.tennis.payload.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;


import javax.validation.constraints.NotBlank;

@RequiredArgsConstructor
@Data
public class LoginRequest {   //Pas de @Entity, ce n'est pas une entité, pas besoin d'Id, besoin uniquement du username + password

	@NotBlank
  	private String username;

	@NotBlank
	private String password;

}

Feature: Registro de usuario en  api
@tags
  Scenario Outline: Registro de usuario
    Given El candidato crea un usuario en el metodo "https://gorest.co.in/"
    When El candidato entrega la informacion para el metodo "public-api/users"
    Then el candidato valida la creacion del usuario en el metodo

    Examples:
      | first_name | last_name | gender    | dob       | email                   | status    |
      | Maria      | Molina    | femenino  | Candidato | mariaEmail@correo.com   | Candidato |
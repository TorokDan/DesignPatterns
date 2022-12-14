package creational.builder.training;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder{

  private String firstName;
  private String lastname;
  private String age;
  private String address;
  private UserWebDTO dto;


  @Override
  public UserDTOBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @Override
  public UserDTOBuilder withLastName(String lastName) {
    this.lastname = lastName;
    return this;
  }

  @Override
  public UserDTOBuilder withBirthday(LocalDate date) {
    Period ageInYears = Period.between(date, LocalDate.now());
    this.age = Integer.toString(ageInYears.getYears());
    return this;
  }

  @Override
  public UserDTOBuilder withAddress(Address address) {
    this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipcode();
    return this;
  }

  @Override
  public UserDTO build() {
    this.dto = new UserWebDTO(firstName + lastname , address, age);
    return dto;
  }

  @Override
  public UserDTO getUserDTO() {
    return dto;
  }
}

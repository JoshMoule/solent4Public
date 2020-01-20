package org.solent.com504.project.model.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
public class Party {

    private Long id;

    private String firstName;

    private String secondName;

    private PartyRole partyRole;

    private Address address = new Address(); // need not null initial value

    private PartyStatus partystatus;

    private String uuid;

    private String password;

    private Party represents;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    @Embedded
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PartyStatus getPartyStatus() {
        return partystatus;
    }

    public void setPartyStatus(PartyStatus partystatus) {
        this.partystatus = partystatus;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @OneToOne
    public Party getRepresents() {
        return represents;
    }

    public void setRepresents(Party represents) {
        this.represents = represents;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Party{" + "id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", partyRole=" + partyRole + ", address=" + address + ", partystatus=" + partystatus + ", uuid=" + uuid + ", password=" + password + ", represents=" + represents + '}';
    }



}

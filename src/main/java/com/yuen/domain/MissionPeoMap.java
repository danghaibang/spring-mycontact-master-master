package com.yuen.domain;
// Generated Jan 30, 2018 8:45:22 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MissionPeoMap generated by hbm2java
 */
@Entity
@Table(name = "mission_peo_map", catalog = "mycontact")
public class MissionPeoMap implements java.io.Serializable {

	private Integer missionPeoId;
	private Peo peo;
	private PeoMissionMapVersion peoMissionMapVersion;
	private UnivMission univMission;

	public MissionPeoMap() {
	}

	public MissionPeoMap(Peo peo, PeoMissionMapVersion peoMissionMapVersion, UnivMission univMission) {
		this.peo = peo;
		this.peoMissionMapVersion = peoMissionMapVersion;
		this.univMission = univMission;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "mission_peo_id", unique = true, nullable = false)
	public Integer getMissionPeoId() {
		return this.missionPeoId;
	}

	public void setMissionPeoId(Integer missionPeoId) {
		this.missionPeoId = missionPeoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peo_id")
	public Peo getPeo() {
		return this.peo;
	}

	public void setPeo(Peo peo) {
		this.peo = peo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peo_mission_map_version_id")
	public PeoMissionMapVersion getPeoMissionMapVersion() {
		return this.peoMissionMapVersion;
	}

	public void setPeoMissionMapVersion(PeoMissionMapVersion peoMissionMapVersion) {
		this.peoMissionMapVersion = peoMissionMapVersion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mission_id")
	public UnivMission getUnivMission() {
		return this.univMission;
	}

	public void setUnivMission(UnivMission univMission) {
		this.univMission = univMission;
	}

}
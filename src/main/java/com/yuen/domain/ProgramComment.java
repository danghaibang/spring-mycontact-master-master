package com.yuen.domain;
// Generated Jan 30, 2018 8:45:22 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProgramComment generated by hbm2java
 */
@Entity
@Table(name = "program_comment", catalog = "mycontact")
public class ProgramComment implements java.io.Serializable {

	private Integer programCommentId;
	private ProgramAccessMode programAccessMode;
	private ProgramDecision programDecision;
	private Date programCommentDate;
	private Date programCommentTime;
	private String programCommentDesc;
	private Set<PeoComment> peoComments = new HashSet<PeoComment>(0);
	private Set<SoComment> soComments = new HashSet<SoComment>(0);
	private Set<ProgramCommentRelationship> programCommentRelationshipsForProProgramCommentId = new HashSet<ProgramCommentRelationship>(
			0);
	private Set<ProgramCommentRelationship> programCommentRelationshipsForProgramCommentId = new HashSet<ProgramCommentRelationship>(
			0);

	public ProgramComment() {
	}

	public ProgramComment(Date programCommentDate, Date programCommentTime, String programCommentDesc) {
		this.programCommentDate = programCommentDate;
		this.programCommentTime = programCommentTime;
		this.programCommentDesc = programCommentDesc;
	}

	public ProgramComment(ProgramAccessMode programAccessMode, ProgramDecision programDecision, Date programCommentDate,
			Date programCommentTime, String programCommentDesc, Set<PeoComment> peoComments, Set<SoComment> soComments,
			Set<ProgramCommentRelationship> programCommentRelationshipsForProProgramCommentId,
			Set<ProgramCommentRelationship> programCommentRelationshipsForProgramCommentId) {
		this.programAccessMode = programAccessMode;
		this.programDecision = programDecision;
		this.programCommentDate = programCommentDate;
		this.programCommentTime = programCommentTime;
		this.programCommentDesc = programCommentDesc;
		this.peoComments = peoComments;
		this.soComments = soComments;
		this.programCommentRelationshipsForProProgramCommentId = programCommentRelationshipsForProProgramCommentId;
		this.programCommentRelationshipsForProgramCommentId = programCommentRelationshipsForProgramCommentId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "program_comment_id", unique = true, nullable = false)
	public Integer getProgramCommentId() {
		return this.programCommentId;
	}

	public void setProgramCommentId(Integer programCommentId) {
		this.programCommentId = programCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_access_mode_id")
	public ProgramAccessMode getProgramAccessMode() {
		return this.programAccessMode;
	}

	public void setProgramAccessMode(ProgramAccessMode programAccessMode) {
		this.programAccessMode = programAccessMode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_decision_id")
	public ProgramDecision getProgramDecision() {
		return this.programDecision;
	}

	public void setProgramDecision(ProgramDecision programDecision) {
		this.programDecision = programDecision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "program_comment_date", nullable = false, length = 10)
	public Date getProgramCommentDate() {
		return this.programCommentDate;
	}

	public void setProgramCommentDate(Date programCommentDate) {
		this.programCommentDate = programCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "program_comment_time", nullable = false, length = 8)
	public Date getProgramCommentTime() {
		return this.programCommentTime;
	}

	public void setProgramCommentTime(Date programCommentTime) {
		this.programCommentTime = programCommentTime;
	}

	@Column(name = "program_comment_desc", nullable = false, length = 65535)
	public String getProgramCommentDesc() {
		return this.programCommentDesc;
	}

	public void setProgramCommentDesc(String programCommentDesc) {
		this.programCommentDesc = programCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programComment")
	public Set<PeoComment> getPeoComments() {
		return this.peoComments;
	}

	public void setPeoComments(Set<PeoComment> peoComments) {
		this.peoComments = peoComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programComment")
	public Set<SoComment> getSoComments() {
		return this.soComments;
	}

	public void setSoComments(Set<SoComment> soComments) {
		this.soComments = soComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programCommentByProProgramCommentId")
	public Set<ProgramCommentRelationship> getProgramCommentRelationshipsForProProgramCommentId() {
		return this.programCommentRelationshipsForProProgramCommentId;
	}

	public void setProgramCommentRelationshipsForProProgramCommentId(
			Set<ProgramCommentRelationship> programCommentRelationshipsForProProgramCommentId) {
		this.programCommentRelationshipsForProProgramCommentId = programCommentRelationshipsForProProgramCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programCommentByProgramCommentId")
	public Set<ProgramCommentRelationship> getProgramCommentRelationshipsForProgramCommentId() {
		return this.programCommentRelationshipsForProgramCommentId;
	}

	public void setProgramCommentRelationshipsForProgramCommentId(
			Set<ProgramCommentRelationship> programCommentRelationshipsForProgramCommentId) {
		this.programCommentRelationshipsForProgramCommentId = programCommentRelationshipsForProgramCommentId;
	}

}

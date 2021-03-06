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
 * QuestionTakerComment generated by hbm2java
 */
@Entity
@Table(name = "question_taker_comment", catalog = "mycontact")
public class QuestionTakerComment implements java.io.Serializable {

	private Integer questionTakerCommentId;
	private Question question;
	private TestTakerComment testTakerComment;
	private Date questionTakerCommentDate;
	private Date questionTakerCommentTime;
	private String questionTakerCommentDesc;
	private Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForParentQuestionTakerCommentId = new HashSet<QuestionTakerCommentRelationship>(
			0);
	private Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForChildQuestionTakerCommentId = new HashSet<QuestionTakerCommentRelationship>(
			0);

	public QuestionTakerComment() {
	}

	public QuestionTakerComment(String questionTakerCommentDesc) {
		this.questionTakerCommentDesc = questionTakerCommentDesc;
	}

	public QuestionTakerComment(Question question, TestTakerComment testTakerComment, Date questionTakerCommentDate,
			Date questionTakerCommentTime, String questionTakerCommentDesc,
			Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForParentQuestionTakerCommentId,
			Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForChildQuestionTakerCommentId) {
		this.question = question;
		this.testTakerComment = testTakerComment;
		this.questionTakerCommentDate = questionTakerCommentDate;
		this.questionTakerCommentTime = questionTakerCommentTime;
		this.questionTakerCommentDesc = questionTakerCommentDesc;
		this.questionTakerCommentRelationshipsForParentQuestionTakerCommentId = questionTakerCommentRelationshipsForParentQuestionTakerCommentId;
		this.questionTakerCommentRelationshipsForChildQuestionTakerCommentId = questionTakerCommentRelationshipsForChildQuestionTakerCommentId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_taker_comment_id", unique = true, nullable = false)
	public Integer getQuestionTakerCommentId() {
		return this.questionTakerCommentId;
	}

	public void setQuestionTakerCommentId(Integer questionTakerCommentId) {
		this.questionTakerCommentId = questionTakerCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "test_taker_comment_id")
	public TestTakerComment getTestTakerComment() {
		return this.testTakerComment;
	}

	public void setTestTakerComment(TestTakerComment testTakerComment) {
		this.testTakerComment = testTakerComment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "question_taker_comment_date", length = 10)
	public Date getQuestionTakerCommentDate() {
		return this.questionTakerCommentDate;
	}

	public void setQuestionTakerCommentDate(Date questionTakerCommentDate) {
		this.questionTakerCommentDate = questionTakerCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "question_taker_comment_time", length = 8)
	public Date getQuestionTakerCommentTime() {
		return this.questionTakerCommentTime;
	}

	public void setQuestionTakerCommentTime(Date questionTakerCommentTime) {
		this.questionTakerCommentTime = questionTakerCommentTime;
	}

	@Column(name = "question_taker_comment_desc", nullable = false, length = 65535)
	public String getQuestionTakerCommentDesc() {
		return this.questionTakerCommentDesc;
	}

	public void setQuestionTakerCommentDesc(String questionTakerCommentDesc) {
		this.questionTakerCommentDesc = questionTakerCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionTakerCommentByParentQuestionTakerCommentId")
	public Set<QuestionTakerCommentRelationship> getQuestionTakerCommentRelationshipsForParentQuestionTakerCommentId() {
		return this.questionTakerCommentRelationshipsForParentQuestionTakerCommentId;
	}

	public void setQuestionTakerCommentRelationshipsForParentQuestionTakerCommentId(
			Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForParentQuestionTakerCommentId) {
		this.questionTakerCommentRelationshipsForParentQuestionTakerCommentId = questionTakerCommentRelationshipsForParentQuestionTakerCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionTakerCommentByChildQuestionTakerCommentId")
	public Set<QuestionTakerCommentRelationship> getQuestionTakerCommentRelationshipsForChildQuestionTakerCommentId() {
		return this.questionTakerCommentRelationshipsForChildQuestionTakerCommentId;
	}

	public void setQuestionTakerCommentRelationshipsForChildQuestionTakerCommentId(
			Set<QuestionTakerCommentRelationship> questionTakerCommentRelationshipsForChildQuestionTakerCommentId) {
		this.questionTakerCommentRelationshipsForChildQuestionTakerCommentId = questionTakerCommentRelationshipsForChildQuestionTakerCommentId;
	}

}

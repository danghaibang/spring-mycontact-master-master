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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "mycontact")
public class User implements java.io.Serializable {

	private Integer userId;
	private String userCode;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userMobile;
	private Date userBirthdate;
	private String userAddress;
	private Set<QuestionAccessMode> questionAccessModesForGrantorId = new HashSet<QuestionAccessMode>(0);
	private Set<TopicAccessMode> topicAccessModesForAccessorId = new HashSet<TopicAccessMode>(0);
	private Set<CourseAccessMode> courseAccessModesForAccessorId = new HashSet<CourseAccessMode>(0);
	private Set<CourseAssignment> courseAssignments = new HashSet<CourseAssignment>(0);
	private Set<QuestionGroup> questionGroups = new HashSet<QuestionGroup>(0);
	private Set<TestReviewerMap> testReviewerMapsForUserId = new HashSet<TestReviewerMap>(0);
	private Set<Account> accounts = new HashSet<Account>(0);
	private Set<ProgramAccessMode> programAccessModesForGrantorId = new HashSet<ProgramAccessMode>(0);
	private Set<ProgramAccessMode> programAccessModesForAccessorId = new HashSet<ProgramAccessMode>(0);
	private Set<TakerTestMap> takerTestMaps = new HashSet<TakerTestMap>(0);
	private Set<QuestionAccessMode> questionAccessModesForAccessorId = new HashSet<QuestionAccessMode>(0);
	private Set<TestAccessMode> testAccessModesForAccessorId = new HashSet<TestAccessMode>(0);
	private Set<Topic> topics = new HashSet<Topic>(0);
	private Set<TopicAccessMode> topicAccessModesForGrantorId = new HashSet<TopicAccessMode>(0);
	private Set<Question> questions = new HashSet<Question>(0);
	private Set<Test> tests = new HashSet<Test>(0);
	private Set<TestAccessMode> testAccessModesForGrantorId = new HashSet<TestAccessMode>(0);
	private Set<CourseAccessMode> courseAccessModesForGrantorId = new HashSet<CourseAccessMode>(0);
	private Set<UserCourseDevmap> userCourseDevmaps = new HashSet<UserCourseDevmap>(0);
	private Set<TestReviewerMap> testReviewerMapsForUseUserId = new HashSet<TestReviewerMap>(0);

	public User() {
	}

	public User(String userCode, String userFirstName) {
		this.userCode = userCode;
		this.userFirstName = userFirstName;
	}

	public User(String userCode, String userFirstName, String userLastName, String userEmail, String userMobile,
			Date userBirthdate, String userAddress, Set<QuestionAccessMode> questionAccessModesForGrantorId,
			Set<TopicAccessMode> topicAccessModesForAccessorId, Set<CourseAccessMode> courseAccessModesForAccessorId,
			Set<CourseAssignment> courseAssignments, Set<QuestionGroup> questionGroups,
			Set<TestReviewerMap> testReviewerMapsForUserId, Set<Account> accounts,
			Set<ProgramAccessMode> programAccessModesForGrantorId,
			Set<ProgramAccessMode> programAccessModesForAccessorId, Set<TakerTestMap> takerTestMaps,
			Set<QuestionAccessMode> questionAccessModesForAccessorId, Set<TestAccessMode> testAccessModesForAccessorId,
			Set<Topic> topics, Set<TopicAccessMode> topicAccessModesForGrantorId, Set<Question> questions,
			Set<Test> tests, Set<TestAccessMode> testAccessModesForGrantorId,
			Set<CourseAccessMode> courseAccessModesForGrantorId, Set<UserCourseDevmap> userCourseDevmaps,
			Set<TestReviewerMap> testReviewerMapsForUseUserId) {
		this.userCode = userCode;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userBirthdate = userBirthdate;
		this.userAddress = userAddress;
		this.questionAccessModesForGrantorId = questionAccessModesForGrantorId;
		this.topicAccessModesForAccessorId = topicAccessModesForAccessorId;
		this.courseAccessModesForAccessorId = courseAccessModesForAccessorId;
		this.courseAssignments = courseAssignments;
		this.questionGroups = questionGroups;
		this.testReviewerMapsForUserId = testReviewerMapsForUserId;
		this.accounts = accounts;
		this.programAccessModesForGrantorId = programAccessModesForGrantorId;
		this.programAccessModesForAccessorId = programAccessModesForAccessorId;
		this.takerTestMaps = takerTestMaps;
		this.questionAccessModesForAccessorId = questionAccessModesForAccessorId;
		this.testAccessModesForAccessorId = testAccessModesForAccessorId;
		this.topics = topics;
		this.topicAccessModesForGrantorId = topicAccessModesForGrantorId;
		this.questions = questions;
		this.tests = tests;
		this.testAccessModesForGrantorId = testAccessModesForGrantorId;
		this.courseAccessModesForGrantorId = courseAccessModesForGrantorId;
		this.userCourseDevmaps = userCourseDevmaps;
		this.testReviewerMapsForUseUserId = testReviewerMapsForUseUserId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_code", nullable = false, length = 10)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Column(name = "user_first_name", nullable = false, length = 100)
	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	@Column(name = "user_last_name", length = 100)
	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	@Email
	@Column(name = "user_email", length = 100)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_mobile", length = 12)
	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "user_birthdate", length = 10)
	public Date getUserBirthdate() {
		return this.userBirthdate;
	}

	public void setUserBirthdate(Date userBirthdate) {
		this.userBirthdate = userBirthdate;
	}

	@Column(name = "user_address", length = 65535)
	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByGrantorId")
	public Set<QuestionAccessMode> getQuestionAccessModesForGrantorId() {
		return this.questionAccessModesForGrantorId;
	}

	public void setQuestionAccessModesForGrantorId(Set<QuestionAccessMode> questionAccessModesForGrantorId) {
		this.questionAccessModesForGrantorId = questionAccessModesForGrantorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByAccessorId")
	public Set<TopicAccessMode> getTopicAccessModesForAccessorId() {
		return this.topicAccessModesForAccessorId;
	}

	public void setTopicAccessModesForAccessorId(Set<TopicAccessMode> topicAccessModesForAccessorId) {
		this.topicAccessModesForAccessorId = topicAccessModesForAccessorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByAccessorId")
	public Set<CourseAccessMode> getCourseAccessModesForAccessorId() {
		return this.courseAccessModesForAccessorId;
	}

	public void setCourseAccessModesForAccessorId(Set<CourseAccessMode> courseAccessModesForAccessorId) {
		this.courseAccessModesForAccessorId = courseAccessModesForAccessorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<CourseAssignment> getCourseAssignments() {
		return this.courseAssignments;
	}

	public void setCourseAssignments(Set<CourseAssignment> courseAssignments) {
		this.courseAssignments = courseAssignments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<QuestionGroup> getQuestionGroups() {
		return this.questionGroups;
	}

	public void setQuestionGroups(Set<QuestionGroup> questionGroups) {
		this.questionGroups = questionGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserId")
	public Set<TestReviewerMap> getTestReviewerMapsForUserId() {
		return this.testReviewerMapsForUserId;
	}

	public void setTestReviewerMapsForUserId(Set<TestReviewerMap> testReviewerMapsForUserId) {
		this.testReviewerMapsForUserId = testReviewerMapsForUserId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByGrantorId")
	public Set<ProgramAccessMode> getProgramAccessModesForGrantorId() {
		return this.programAccessModesForGrantorId;
	}

	public void setProgramAccessModesForGrantorId(Set<ProgramAccessMode> programAccessModesForGrantorId) {
		this.programAccessModesForGrantorId = programAccessModesForGrantorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByAccessorId")
	public Set<ProgramAccessMode> getProgramAccessModesForAccessorId() {
		return this.programAccessModesForAccessorId;
	}

	public void setProgramAccessModesForAccessorId(Set<ProgramAccessMode> programAccessModesForAccessorId) {
		this.programAccessModesForAccessorId = programAccessModesForAccessorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<TakerTestMap> getTakerTestMaps() {
		return this.takerTestMaps;
	}

	public void setTakerTestMaps(Set<TakerTestMap> takerTestMaps) {
		this.takerTestMaps = takerTestMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByAccessorId")
	public Set<QuestionAccessMode> getQuestionAccessModesForAccessorId() {
		return this.questionAccessModesForAccessorId;
	}

	public void setQuestionAccessModesForAccessorId(Set<QuestionAccessMode> questionAccessModesForAccessorId) {
		this.questionAccessModesForAccessorId = questionAccessModesForAccessorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByAccessorId")
	public Set<TestAccessMode> getTestAccessModesForAccessorId() {
		return this.testAccessModesForAccessorId;
	}

	public void setTestAccessModesForAccessorId(Set<TestAccessMode> testAccessModesForAccessorId) {
		this.testAccessModesForAccessorId = testAccessModesForAccessorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByGrantorId")
	public Set<TopicAccessMode> getTopicAccessModesForGrantorId() {
		return this.topicAccessModesForGrantorId;
	}

	public void setTopicAccessModesForGrantorId(Set<TopicAccessMode> topicAccessModesForGrantorId) {
		this.topicAccessModesForGrantorId = topicAccessModesForGrantorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Test> getTests() {
		return this.tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByGrantorId")
	public Set<TestAccessMode> getTestAccessModesForGrantorId() {
		return this.testAccessModesForGrantorId;
	}

	public void setTestAccessModesForGrantorId(Set<TestAccessMode> testAccessModesForGrantorId) {
		this.testAccessModesForGrantorId = testAccessModesForGrantorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByGrantorId")
	public Set<CourseAccessMode> getCourseAccessModesForGrantorId() {
		return this.courseAccessModesForGrantorId;
	}

	public void setCourseAccessModesForGrantorId(Set<CourseAccessMode> courseAccessModesForGrantorId) {
		this.courseAccessModesForGrantorId = courseAccessModesForGrantorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserCourseDevmap> getUserCourseDevmaps() {
		return this.userCourseDevmaps;
	}

	public void setUserCourseDevmaps(Set<UserCourseDevmap> userCourseDevmaps) {
		this.userCourseDevmaps = userCourseDevmaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUseUserId")
	public Set<TestReviewerMap> getTestReviewerMapsForUseUserId() {
		return this.testReviewerMapsForUseUserId;
	}

	public void setTestReviewerMapsForUseUserId(Set<TestReviewerMap> testReviewerMapsForUseUserId) {
		this.testReviewerMapsForUseUserId = testReviewerMapsForUseUserId;
	}

}

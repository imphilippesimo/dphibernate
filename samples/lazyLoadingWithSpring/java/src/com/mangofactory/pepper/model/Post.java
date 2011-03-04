package com.mangofactory.pepper.model;
// default package
// Generated 26-Jun-2010 11:51:56 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Post generated by hbm2java
 */
@Entity
@Table(name = "posts")
public class Post extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OwnerUserId")
	private User author;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ParentId")
	private Post parent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PostTypeId", nullable = false)
	private PostType postType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LastEditorUserId")
	private User lastEditor;
	
	private Integer answerCount;
	@Column(length = 65535)
	private String body;
	private Date closedDate;
	private Integer commentCount;
	private Date communityOwnedDate;
	private Date creationDate;
	private Integer favoriteCount;
	private Date lastActivityDate;
	private Date lastEditDate;
	private String lastEditorDisplayName;
	private int score;
	private String tags;
	private String title;
	private int viewCount;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent",targetEntity=Post.class)
	private Set<Post> replies = new HashSet<Post>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
	private Set<Comment> comments = new HashSet<Comment>(0);
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AcceptedAnswerId")
	private Post acceptedAnswer;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
	private Set<PostTag> postTags = new HashSet<PostTag>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
	private Set<Vote> votes = new HashSet<Vote>(0);

	public Post() {
	}

	public User getAuthor() {
		return this.author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	
	public Post getParent() {
		return this.parent;
	}

	public void setParent(Post postByParentId) {
		this.parent = postByParentId;
	}

	public PostType getPostType() {
		return this.postType;
	}

	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	public User getLastEditor() {
		return this.lastEditor;
	}

	public void setLastEditor(User userByLastEditorUserId) {
		this.lastEditor = userByLastEditorUserId;
	}
	
	public Post getAcceptedAnswer() {
		return this.acceptedAnswer;
	}

	public void setAcceptedAnswer(Post postByAcceptedAnswerId) {
		this.acceptedAnswer = postByAcceptedAnswerId;
	}

	public Integer getAnswerCount() {
		return this.answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Date getCommunityOwnedDate() {
		return this.communityOwnedDate;
	}

	public void setCommunityOwnedDate(Date communityOwnedDate) {
		this.communityOwnedDate = communityOwnedDate;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "FavoriteCount")
	public Integer getFavoriteCount() {
		return this.favoriteCount;
	}

	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public Date getLastActivityDate() {
		return this.lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Date getLastEditDate() {
		return this.lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	public String getLastEditorDisplayName() {
		return this.lastEditorDisplayName;
	}

	public void setLastEditorDisplayName(String lastEditorDisplayName) {
		this.lastEditorDisplayName = lastEditorDisplayName;
	}

	@Column(name = "Score", nullable = false)
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<PostTag> getPostTags() {
		return this.postTags;
	}

	public void setPostTags(Set<PostTag> postTags) {
		this.postTags = postTags;
	}

	public Set<Vote> getVotes() {
		return this.votes;
	}

	public void setVotes(Set<Vote> votes) {
		this.votes = votes;
	}

	public void setReplies(Set<Post> replies) {
		this.replies = replies;
	}

	public Set<Post> getReplies() {
		return replies;
	}
	
	public String getAuthorDisplayName()
	{
		return author.getDisplayName();
	}
	public void setAuthorDisplayName(String value)
	{
		// Does nothing
	}

}
package lu.tessyglodt.site.data;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import com.github.slugify.Slugify;

public class Page {
	/*
	 * id | integer | not null default nextval('systemevents_id_seq'::regclass)
	 * customerid | bigint | receivedat | timestamp without time zone |
	 * devicereportedtime | timestamp without time zone | facility | smallint |
	 * priority | smallint | fromhost | character varying(60) | message | text |
	 * ntseverity | integer | importance | integer | eventsource | character
	 * varying(60) | eventuser | character varying(60) | eventcategory | integer
	 * | eventid | integer | eventbinarydata | text | maxavailable | integer |
	 * currusage | integer | minusage | integer | maxusage | integer |
	 * infounitid | integer | syslogtag | character varying(60) | eventlogtype |
	 * character varying(60) | genericfilename | character varying(60) |
	 * systemid | integer |
	 */

	// private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	public static final int	TYPE_KIERCHTUERMS­PROMENADEN_ARTICLE	= 0;
	public static final int	TYPE_KIERCHTUERMS­PROMENADEN_PAGE		= 1;

	public static final int	SITE_KIERCHTUERMS­PROMENADEN			= 0;

	private String			id;

	private String			name;

	private String			title;

	private String			content;

	private Municipality	municipality;

	private BigDecimal		latitude;

	private BigDecimal		longitude;

	// private Integer/BigDecimal fotoWindow in metres ideally
	// http://stackoverflow.com/questions/7477003/calculating-new-longtitude-latitude-from-old-n-meters

	private Integer			viewCount;

	private boolean			published								= true;

	private Date			dateCreated;
	private Date			dateModified;
	private Date			datePublished;
	private Date			dateLastView;

	private Integer			site									= 0;
	private Integer			type									= 0;

	public Page() {
	}

	public Page(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public Municipality getMunicipality() {
		return municipality;
	}

	public void setMunicipality(final Municipality municipality) {
		this.municipality = municipality;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(final BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(final BigDecimal longitude) {
		this.longitude = longitude;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(final Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(final Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(final Date datePublished) {
		this.datePublished = datePublished;
	}

	public void setDatePublished(final String datePublished) {
		this.datePublished = new Date(Long.valueOf(datePublished));
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(final Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Date getDateLastView() {
		return dateLastView;
	}

	public void setDateLastView(final Date dateLastView) {
		this.dateLastView = dateLastView;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(final boolean published) {
		this.published = published;
	}

	public Integer getSite() {
		return site;
	}

	public void setSite(final Integer site) {
		this.site = site;
	}

	public Integer getType() {
		return type;
	}

	public void setType(final Integer type) {
		this.type = type;
	}

	public String getSlugName() throws IOException {
		return new Slugify().slugify(name);
	}

	@Override
	public String toString() {
		return "Page [name=" + name + ", title=" + title + ", latitude=" + latitude + ", longitude=" + longitude + ", datePublished=" + datePublished + "]";
	}

}
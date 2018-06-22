/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemAttributes 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5321329618939434608L;
    private List<String> actor;
    private List<String> artist;
    private String aspectRatio;
    private String audienceRating;
    private List<String> audioFormat;
    private List<String> author;
    private String binding;
    private String brand;
    private CatalogNumberList catalogNumberList;
    private List<String> category;
    private String cEROAgeRating;
    private String clothingSize;
    private String color;
    private List<Creator> creator;
    private String department;
    private List<String> director;
    private String eAN;
    private EANList eANList;
    private String edition;
    private List<String> eISBN;
    private String energyEfficiencyClass;
    private String episodeSequence;
    private String eSRBAgeRating;
    private List<String> feature;
    private List<String> format;
    private String genre;
    private String hardwarePlatform;
    private String hazardousMaterialType;
    private Boolean isAdultProduct;
    private Boolean isAutographed;
    private String iSBN;
    private Boolean isEligibleForTradeIn;
    private Boolean isMemorabilia;
    private String issuesPerYear;
    private ItemDimensions itemDimensions;
    private String itemPartNumber;
    private String label;
    private Languages languages;
    private String legalDisclaimer;
    private Price listPrice;
    private String magazineType;
    private String manufacturer;
    private DecimalWithUnits manufacturerMaximumAge;
    private DecimalWithUnits manufacturerMinimumAge;
    private String manufacturerPartsWarrantyDescription;
    private String mediaType;
    private String model;
    private Integer modelYear;
    private String mPN;
    private Integer numberOfDiscs;
    private Integer numberOfIssues;
    private Integer numberOfItems;
    private Integer numberOfPages;
    private Integer numberOfTracks;
    private String operatingSystem;
    private PackageDimensions packageDimensions;
    private Integer packageQuantity;
    private String partNumber;
    private List<String> pictureFormat;
    private List<String> platform;
    private String productGroup;
    private String productTypeName;
    private String productTypeSubcategory;
    private String publicationDate;
    private String publisher;
    private String regionCode;
    private String releaseDate;
    private String seasonSequence;
    private DecimalWithUnits runningTime;
    private String seikodoProductCode;
    private String size;
    private String sKU;
    private String studio;
    private NonNegativeIntegerWithUnits subscriptionLength;
    private String title;
    private String trackSequence;
    private Price tradeInValue;
    private String uPC;
    private UPCList uPCList;
    private String warranty;
    private Price wEEETaxValue;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Actor")
    public List<String> getActor ( ) { 
        return this.actor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Actor")
    public void setActor (List<String> value) { 
        this.actor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Artist")
    public List<String> getArtist ( ) { 
        return this.artist;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Artist")
    public void setArtist (List<String> value) { 
        this.artist = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AspectRatio")
    public String getAspectRatio ( ) { 
        return this.aspectRatio;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AspectRatio")
    public void setAspectRatio (String value) { 
        this.aspectRatio = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AudienceRating")
    public String getAudienceRating ( ) { 
        return this.audienceRating;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AudienceRating")
    public void setAudienceRating (String value) { 
        this.audienceRating = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AudioFormat")
    public List<String> getAudioFormat ( ) { 
        return this.audioFormat;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AudioFormat")
    public void setAudioFormat (List<String> value) { 
        this.audioFormat = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Author")
    public List<String> getAuthor ( ) { 
        return this.author;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Author")
    public void setAuthor (List<String> value) { 
        this.author = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Binding")
    public String getBinding ( ) { 
        return this.binding;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Binding")
    public void setBinding (String value) { 
        this.binding = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CatalogNumberList")
    public CatalogNumberList getCatalogNumberList ( ) { 
        return this.catalogNumberList;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CatalogNumberList")
    public void setCatalogNumberList (CatalogNumberList value) { 
        this.catalogNumberList = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Category")
    public List<String> getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Category")
    public void setCategory (List<String> value) { 
        this.category = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CEROAgeRating")
    public String getCEROAgeRating ( ) { 
        return this.cEROAgeRating;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CEROAgeRating")
    public void setCEROAgeRating (String value) { 
        this.cEROAgeRating = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ClothingSize")
    public String getClothingSize ( ) { 
        return this.clothingSize;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ClothingSize")
    public void setClothingSize (String value) { 
        this.clothingSize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Color")
    public String getColor ( ) { 
        return this.color;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Color")
    public void setColor (String value) { 
        this.color = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Creator")
    public List<Creator> getCreator ( ) { 
        return this.creator;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Creator")
    public void setCreator (List<Creator> value) { 
        this.creator = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Department")
    public String getDepartment ( ) { 
        return this.department;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Department")
    public void setDepartment (String value) { 
        this.department = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Director")
    public List<String> getDirector ( ) { 
        return this.director;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Director")
    public void setDirector (List<String> value) { 
        this.director = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EAN")
    public String getEAN ( ) { 
        return this.eAN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EAN")
    public void setEAN (String value) { 
        this.eAN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EANList")
    public EANList getEANList ( ) { 
        return this.eANList;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EANList")
    public void setEANList (EANList value) { 
        this.eANList = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Edition")
    public String getEdition ( ) { 
        return this.edition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Edition")
    public void setEdition (String value) { 
        this.edition = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EISBN")
    public List<String> getEISBN ( ) { 
        return this.eISBN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EISBN")
    public void setEISBN (List<String> value) { 
        this.eISBN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EnergyEfficiencyClass")
    public String getEnergyEfficiencyClass ( ) { 
        return this.energyEfficiencyClass;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EnergyEfficiencyClass")
    public void setEnergyEfficiencyClass (String value) { 
        this.energyEfficiencyClass = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EpisodeSequence")
    public String getEpisodeSequence ( ) { 
        return this.episodeSequence;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EpisodeSequence")
    public void setEpisodeSequence (String value) { 
        this.episodeSequence = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ESRBAgeRating")
    public String getESRBAgeRating ( ) { 
        return this.eSRBAgeRating;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ESRBAgeRating")
    public void setESRBAgeRating (String value) { 
        this.eSRBAgeRating = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Feature")
    public List<String> getFeature ( ) { 
        return this.feature;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Feature")
    public void setFeature (List<String> value) { 
        this.feature = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Format")
    public List<String> getFormat ( ) { 
        return this.format;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Format")
    public void setFormat (List<String> value) { 
        this.format = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Genre")
    public String getGenre ( ) { 
        return this.genre;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Genre")
    public void setGenre (String value) { 
        this.genre = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HardwarePlatform")
    public String getHardwarePlatform ( ) { 
        return this.hardwarePlatform;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HardwarePlatform")
    public void setHardwarePlatform (String value) { 
        this.hardwarePlatform = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HazardousMaterialType")
    public String getHazardousMaterialType ( ) { 
        return this.hazardousMaterialType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HazardousMaterialType")
    public void setHazardousMaterialType (String value) { 
        this.hazardousMaterialType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsAdultProduct")
    public Boolean getIsAdultProduct ( ) { 
        return this.isAdultProduct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsAdultProduct")
    public void setIsAdultProduct (Boolean value) { 
        this.isAdultProduct = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsAutographed")
    public Boolean getIsAutographed ( ) { 
        return this.isAutographed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsAutographed")
    public void setIsAutographed (Boolean value) { 
        this.isAutographed = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ISBN")
    public String getISBN ( ) { 
        return this.iSBN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ISBN")
    public void setISBN (String value) { 
        this.iSBN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsEligibleForTradeIn")
    public Boolean getIsEligibleForTradeIn ( ) { 
        return this.isEligibleForTradeIn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsEligibleForTradeIn")
    public void setIsEligibleForTradeIn (Boolean value) { 
        this.isEligibleForTradeIn = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsMemorabilia")
    public Boolean getIsMemorabilia ( ) { 
        return this.isMemorabilia;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsMemorabilia")
    public void setIsMemorabilia (Boolean value) { 
        this.isMemorabilia = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IssuesPerYear")
    public String getIssuesPerYear ( ) { 
        return this.issuesPerYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IssuesPerYear")
    public void setIssuesPerYear (String value) { 
        this.issuesPerYear = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemDimensions")
    public ItemDimensions getItemDimensions ( ) { 
        return this.itemDimensions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemDimensions")
    public void setItemDimensions (ItemDimensions value) { 
        this.itemDimensions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemPartNumber")
    public String getItemPartNumber ( ) { 
        return this.itemPartNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemPartNumber")
    public void setItemPartNumber (String value) { 
        this.itemPartNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Languages")
    public Languages getLanguages ( ) { 
        return this.languages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Languages")
    public void setLanguages (Languages value) { 
        this.languages = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LegalDisclaimer")
    public String getLegalDisclaimer ( ) { 
        return this.legalDisclaimer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LegalDisclaimer")
    public void setLegalDisclaimer (String value) { 
        this.legalDisclaimer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ListPrice")
    public Price getListPrice ( ) { 
        return this.listPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ListPrice")
    public void setListPrice (Price value) { 
        this.listPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MagazineType")
    public String getMagazineType ( ) { 
        return this.magazineType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MagazineType")
    public void setMagazineType (String value) { 
        this.magazineType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ManufacturerMaximumAge")
    public DecimalWithUnits getManufacturerMaximumAge ( ) { 
        return this.manufacturerMaximumAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ManufacturerMaximumAge")
    public void setManufacturerMaximumAge (DecimalWithUnits value) { 
        this.manufacturerMaximumAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ManufacturerMinimumAge")
    public DecimalWithUnits getManufacturerMinimumAge ( ) { 
        return this.manufacturerMinimumAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ManufacturerMinimumAge")
    public void setManufacturerMinimumAge (DecimalWithUnits value) { 
        this.manufacturerMinimumAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ManufacturerPartsWarrantyDescription")
    public String getManufacturerPartsWarrantyDescription ( ) { 
        return this.manufacturerPartsWarrantyDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ManufacturerPartsWarrantyDescription")
    public void setManufacturerPartsWarrantyDescription (String value) { 
        this.manufacturerPartsWarrantyDescription = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MediaType")
    public String getMediaType ( ) { 
        return this.mediaType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MediaType")
    public void setMediaType (String value) { 
        this.mediaType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Model")
    public String getModel ( ) { 
        return this.model;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Model")
    public void setModel (String value) { 
        this.model = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ModelYear")
    public Integer getModelYear ( ) { 
        return this.modelYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ModelYear")
    public void setModelYear (Integer value) { 
        this.modelYear = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MPN")
    public String getMPN ( ) { 
        return this.mPN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MPN")
    public void setMPN (String value) { 
        this.mPN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberOfDiscs")
    public Integer getNumberOfDiscs ( ) { 
        return this.numberOfDiscs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberOfDiscs")
    public void setNumberOfDiscs (Integer value) { 
        this.numberOfDiscs = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberOfIssues")
    public Integer getNumberOfIssues ( ) { 
        return this.numberOfIssues;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberOfIssues")
    public void setNumberOfIssues (Integer value) { 
        this.numberOfIssues = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberOfItems")
    public Integer getNumberOfItems ( ) { 
        return this.numberOfItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberOfItems")
    public void setNumberOfItems (Integer value) { 
        this.numberOfItems = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberOfPages")
    public Integer getNumberOfPages ( ) { 
        return this.numberOfPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberOfPages")
    public void setNumberOfPages (Integer value) { 
        this.numberOfPages = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NumberOfTracks")
    public Integer getNumberOfTracks ( ) { 
        return this.numberOfTracks;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NumberOfTracks")
    public void setNumberOfTracks (Integer value) { 
        this.numberOfTracks = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OperatingSystem")
    public String getOperatingSystem ( ) { 
        return this.operatingSystem;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OperatingSystem")
    public void setOperatingSystem (String value) { 
        this.operatingSystem = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PackageDimensions")
    public PackageDimensions getPackageDimensions ( ) { 
        return this.packageDimensions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PackageDimensions")
    public void setPackageDimensions (PackageDimensions value) { 
        this.packageDimensions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PackageQuantity")
    public Integer getPackageQuantity ( ) { 
        return this.packageQuantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PackageQuantity")
    public void setPackageQuantity (Integer value) { 
        this.packageQuantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PartNumber")
    public String getPartNumber ( ) { 
        return this.partNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PartNumber")
    public void setPartNumber (String value) { 
        this.partNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PictureFormat")
    public List<String> getPictureFormat ( ) { 
        return this.pictureFormat;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PictureFormat")
    public void setPictureFormat (List<String> value) { 
        this.pictureFormat = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Platform")
    public List<String> getPlatform ( ) { 
        return this.platform;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Platform")
    public void setPlatform (List<String> value) { 
        this.platform = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ProductGroup")
    public String getProductGroup ( ) { 
        return this.productGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ProductGroup")
    public void setProductGroup (String value) { 
        this.productGroup = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ProductTypeName")
    public String getProductTypeName ( ) { 
        return this.productTypeName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ProductTypeName")
    public void setProductTypeName (String value) { 
        this.productTypeName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ProductTypeSubcategory")
    public String getProductTypeSubcategory ( ) { 
        return this.productTypeSubcategory;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ProductTypeSubcategory")
    public void setProductTypeSubcategory (String value) { 
        this.productTypeSubcategory = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PublicationDate")
    public String getPublicationDate ( ) { 
        return this.publicationDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PublicationDate")
    public void setPublicationDate (String value) { 
        this.publicationDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Publisher")
    public String getPublisher ( ) { 
        return this.publisher;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Publisher")
    public void setPublisher (String value) { 
        this.publisher = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RegionCode")
    public String getRegionCode ( ) { 
        return this.regionCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RegionCode")
    public void setRegionCode (String value) { 
        this.regionCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ReleaseDate")
    public String getReleaseDate ( ) { 
        return this.releaseDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ReleaseDate")
    public void setReleaseDate (String value) { 
        this.releaseDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SeasonSequence")
    public String getSeasonSequence ( ) { 
        return this.seasonSequence;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SeasonSequence")
    public void setSeasonSequence (String value) { 
        this.seasonSequence = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RunningTime")
    public DecimalWithUnits getRunningTime ( ) { 
        return this.runningTime;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RunningTime")
    public void setRunningTime (DecimalWithUnits value) { 
        this.runningTime = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SeikodoProductCode")
    public String getSeikodoProductCode ( ) { 
        return this.seikodoProductCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SeikodoProductCode")
    public void setSeikodoProductCode (String value) { 
        this.seikodoProductCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Size")
    public String getSize ( ) { 
        return this.size;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Size")
    public void setSize (String value) { 
        this.size = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SKU")
    public String getSKU ( ) { 
        return this.sKU;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SKU")
    public void setSKU (String value) { 
        this.sKU = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Studio")
    public String getStudio ( ) { 
        return this.studio;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Studio")
    public void setStudio (String value) { 
        this.studio = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SubscriptionLength")
    public NonNegativeIntegerWithUnits getSubscriptionLength ( ) { 
        return this.subscriptionLength;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SubscriptionLength")
    public void setSubscriptionLength (NonNegativeIntegerWithUnits value) { 
        this.subscriptionLength = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TrackSequence")
    public String getTrackSequence ( ) { 
        return this.trackSequence;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TrackSequence")
    public void setTrackSequence (String value) { 
        this.trackSequence = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TradeInValue")
    public Price getTradeInValue ( ) { 
        return this.tradeInValue;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TradeInValue")
    public void setTradeInValue (Price value) { 
        this.tradeInValue = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("UPC")
    public String getUPC ( ) { 
        return this.uPC;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("UPC")
    public void setUPC (String value) { 
        this.uPC = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("UPCList")
    public UPCList getUPCList ( ) { 
        return this.uPCList;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("UPCList")
    public void setUPCList (UPCList value) { 
        this.uPCList = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Warranty")
    public String getWarranty ( ) { 
        return this.warranty;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Warranty")
    public void setWarranty (String value) { 
        this.warranty = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("WEEETaxValue")
    public Price getWEEETaxValue ( ) { 
        return this.wEEETaxValue;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("WEEETaxValue")
    public void setWEEETaxValue (Price value) { 
        this.wEEETaxValue = value;
    }
 
}
 
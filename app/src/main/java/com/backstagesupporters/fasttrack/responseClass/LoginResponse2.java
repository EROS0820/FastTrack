package com.backstagesupporters.fasttrack.responseClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse2 {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    //Data
    public class Data {

        @SerializedName("token")
        @Expose
        private Token token;
        @SerializedName("user")
        @Expose
        private User user;

        public Token getToken() {
            return token;
        }

        public void setToken(Token token) {
            this.token = token;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

    }

    // Token
    public class Token {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("device_token")
        @Expose
        private String deviceToken;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
    }

    // User
    public class User {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("mobile")
        @Expose
        private String mobile;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("email_verified_at")
        @Expose
        private String emailVerifiedAt;
        @SerializedName("mobile_verified_at")
        @Expose
        private String mobileVerifiedAt;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("provider")
        @Expose
        private String provider;
        @SerializedName("provider_id")
        @Expose
        private String providerId;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("parent_user")
        @Expose
        private String parentUser;
        @SerializedName("device_token")
        @Expose
        private String deviceToken;
        @SerializedName("franchise_id")
        @Expose
        private String franchiseId;
        @SerializedName("mobile_model")
        @Expose
        private String mobileModel;
        @SerializedName("user_name")
        @Expose
        private String userName;
        @SerializedName("account_status")
        @Expose
        private String accountStatus;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("activation_date")
        @Expose
        private String activationDate;
        @SerializedName("expiry_date")
        @Expose
        private String expiryDate;
        @SerializedName("default_car")
        @Expose
        private String defaultCar;
        @SerializedName("web_login_status")
        @Expose
        private String webLoginStatus;
        @SerializedName("app_login_status")
        @Expose
        private String appLoginStatus;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getEmailVerifiedAt() {
            return emailVerifiedAt;
        }

        public void setEmailVerifiedAt(String emailVerifiedAt) {
            this.emailVerifiedAt = emailVerifiedAt;
        }

        public String getMobileVerifiedAt() {
            return mobileVerifiedAt;
        }

        public void setMobileVerifiedAt(String mobileVerifiedAt) {
            this.mobileVerifiedAt = mobileVerifiedAt;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getProvider() {
            return provider;
        }

        public void setProvider(String provider) {
            this.provider = provider;
        }

        public String getProviderId() {
            return providerId;
        }

        public void setProviderId(String providerId) {
            this.providerId = providerId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getParentUser() {
            return parentUser;
        }

        public void setParentUser(String parentUser) {
            this.parentUser = parentUser;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getFranchiseId() {
            return franchiseId;
        }

        public void setFranchiseId(String franchiseId) {
            this.franchiseId = franchiseId;
        }

        public String getMobileModel() {
            return mobileModel;
        }

        public void setMobileModel(String mobileModel) {
            this.mobileModel = mobileModel;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getActivationDate() {
            return activationDate;
        }

        public void setActivationDate(String activationDate) {
            this.activationDate = activationDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getDefaultCar() {
            return defaultCar;
        }

        public void setDefaultCar(String defaultCar) {
            this.defaultCar = defaultCar;
        }

        public String getWebLoginStatus() {
            return webLoginStatus;
        }

        public void setWebLoginStatus(String webLoginStatus) {
            this.webLoginStatus = webLoginStatus;
        }

        public String getAppLoginStatus() {
            return appLoginStatus;
        }

        public void setAppLoginStatus(String appLoginStatus) {
            this.appLoginStatus = appLoginStatus;
        }

    }

}
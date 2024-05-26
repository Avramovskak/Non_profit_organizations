# Non-Profit Organization Management API

## Introduction
This API allows non-profit organizations to manage donations, donor profiles, fundraising campaigns, and event planning. It facilitates efficient tracking and management of all related activities.

## Base URL

## Endpoints

### Campaigns

#### Create a New Campaign
- **HTTP Method:** POST
- **Endpoint:** `/campaigns`
- **Description:** Initiate a new fundraising campaign.
- **Request Headers:** `Content-Type: application/json`
- **Request Body:**
    ```json
    {
      "campaignName": "Campaign Name",
      "campaignDescription": "Campaign Description",
      "campaignLocation": "Location",
      "campaignCity": "City",
      "campaignCountry": "Country",
      "campaignGoalAmount": 10000.00
    }
    ```
- **Responses:**
  - **201 Created:**
    ```json
    {
      "id": 1,
      "campaignName": "Campaign Name",
      "campaignDescription": "Campaign Description",
      "campaignLocation": "Location",
      "campaignCity": "City",
      "campaignCountry": "Country",
      "campaignGoalAmount": 10000.00
    }
    ```
  - **400 Bad Request:** Invalid input

#### View All Campaigns
- **HTTP Method:** GET
- **Endpoint:** `/campaigns`
- **Description:** View all fundraising campaigns.
- **Request Headers:** `Accept: application/json`
- **Responses:**
  - **200 OK:**
    ```json
    [
      {
        "id": 1,
        "campaignName": "Campaign Name",
        "campaignDescription": "Campaign Description",
        "campaignLocation": "Location",
        "campaignCity": "City",
        "campaignCountry": "Country",
        "campaignGoalAmount": 10000.00
      },
      
    ]
    ```
  - **204 No Content:** No campaigns found

#### Retrieve a Single Campaign
- **HTTP Method:** GET
- **Endpoint:** `/campaigns/{id}`
- **Description:** Retrieve details of a single campaign by its ID.
- **Request Headers:** `Accept: application/json`
- **Path Parameters:** `id` (integer): ID of the campaign
- **Responses:**
  - **200 OK:**
    ```json
    {
      "id": 1,
      "campaignName": "Campaign Name",
      "campaignDescription": "Campaign Description",
      "campaignLocation": "Location",
      "campaignCity": "City",
      "campaignCountry": "Country",
      "campaignGoalAmount": 10000.00
    }
    ```
  - **404 Not Found:** Campaign not found

#### Update Campaign Information
- **HTTP Method:** PUT
- **Endpoint:** `/campaigns/{id}`
- **Description:** Update campaign information.
- **Request Headers:** `Content-Type: application/json`
- **Path Parameters:** `id` (integer): ID of the campaign
- **Request Body:**
    ```json
    {
      "campaignName": "Updated Campaign Name",
      "campaignDescription": "Updated Campaign Description"
    }
    ```
- **Responses:**
  - **200 OK:**
    ```json
    {
      "id": 1,
      "campaignName": "Updated Campaign Name",
      "campaignDescription": "Updated Campaign Description",
      "campaignLocation": "Location",
      "campaignCity": "City",
      "campaignCountry": "Country",
      "campaignGoalAmount": 10000.00
    }
    ```
  - **400 Bad Request:** Invalid input
  - **404 Not Found:** Campaign not found

#### Delete Campaign
- **HTTP Method:** DELETE
- **Endpoint:** `/campaigns/{id}`
- **Description:** Cancel a fundraising campaign.
- **Request Headers:** `Accept: application/json`
- **Path Parameters:** `id` (integer): ID of the campaign
- **Responses:**
  - **204 No Content:** Successfully deleted
  - **404 Not Found:** Campaign not found
    
## Repeat Similar CRUD Operations for Donations, Donors and Events

### Donations Endpoints
- **POST /donations:** Create a new donation
- **GET /donations:** View all donations
- **GET /donations/{id}:** Retrieve a single donation
- **PUT /donations/{id}:** Update donation details
- **DELETE /donations/{id}:** Delete a donation

### Donors Endpoints
- **POST /donors:** Create a new donor
- **GET /donors:** View all donors
- **GET /donors/{id}:** Retrieve a single donor
- **PUT /donors/{id}:** Update donor details
- **DELETE /donors/{id}:** Delete a donor

### Events Endpoints
- **POST /events:** Create a new event
- **GET /events:** View all events
- **GET /events/{id}:** Retrieve a single event
- **PUT /events/{id}:** Update event details
- **DELETE /events/{id}:** Delete an event
